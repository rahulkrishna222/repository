package com.grandmaster.web.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.connection.DBConnector;
import com.grandmaster.db.entity.Feedback;
import com.grandmaster.db.entity.FeedbackList;
import com.grandmaster.db.service.FeedbackService;
import com.grandmaster.db.service.impl.FeedbackServiceImpl;

/**
 * Servlet implementation class FeedbackProcessorServlet
 */
public class FeedbackProcessorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private FeedbackService   feedbackService;

    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        super.init();
        feedbackService = new FeedbackServiceImpl();

    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackProcessorServlet() {
        super();
        System.out.println("Feedback servlet created");
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get single feedback or all
        boolean isListing = false;

        if (request.getParameter("all") != null) {
            isListing = Boolean.valueOf(request.getParameter("all"));
        }

        if (isListing) {
            // Request reached for getting list of feedback
            int start = -1;
            int numOfRecordToRetrive = -1;
            try {
                start = Integer.parseInt(request.getParameter("start"));

                numOfRecordToRetrive = Integer.parseInt(request.getParameter("count"));
            } catch (Exception e) {
                // TODO : Write logger info
               // e.printStackTrace();
            }

            List<Feedback> feedbackList = null;
            try {
                feedbackList = (List<Feedback>) feedbackService.findAll(start, numOfRecordToRetrive);
                
                FeedbackList list = new FeedbackList();

                list.setFeedbackList(feedbackList);
                
                request.setAttribute("feedbackList", list);
            } catch (SQLException e) {
                // TODO Handle proper exceptions
                e.printStackTrace();
            }

            
            request.getRequestDispatcher("/feedback_view.jsp").forward(request, response);

        } else {
            // Request reached for getting a particular feedback
            int feedbackId = Integer.parseInt(request.getParameter("id"));

            Feedback feedback = (Feedback) feedbackService.select(feedbackId);

            request.setAttribute("feedback", feedback);
            request.getRequestDispatcher("/F_reply.jsp").forward(request, response);
        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Feedback feedback = new Feedback();
        
        System.out.println(request.getParameterMap().toString());
        feedback.setName(request.getParameter("txtName"));
        feedback.setEmail(request.getParameter("txtEmail"));
        feedback.setSubject(request.getParameter("txtSubject"));
        feedback.setMessage(request.getParameter("txtMessage"));

        feedback = feedbackService.save(feedback);
        if (feedback != null && feedback.getId() != null) {
            // Created new feedback
            // Return a Feedback Id for future refernce

            String message = "Thank you for submitting your feedback. We'll get back to you soon. <br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp Please write down your refernce number : "
                    + "FED_" + feedback.getId() + "_" + System.currentTimeMillis();
            request.setAttribute("message", message);
            
            request.getRequestDispatcher("/save_success.jsp").forward(request, response);
        }else{
            String message = "There is some error occured while submitting your record, please try again later";
            
            request.setAttribute("message", message);
            
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }

    }
}
