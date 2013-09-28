package com.grandmaster.web.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.entity.FeedbackReply;
import com.grandmaster.db.service.FeedbackReplyService;
import com.grandmaster.db.service.impl.FeedbackReplyServiceImpl;

/**
 * Servlet implementation class FeedbackReplyServlet
 */
public class FeedbackReplyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackReplyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getSession().getAttribute("userId") == null) {
            request.getRequestDispatcher("/login.html").forward(request, response);
        }

        FeedbackReply feedbackReply = new FeedbackReply();

        feedbackReply.setFeedbackId(Integer.parseInt(request.getParameter("txtFeedbackId")));
        feedbackReply.setRepliedByUser(Integer.parseInt(request.getSession().getAttribute("userId").toString()));
        feedbackReply.setResponse(request.getParameter("txtReplymessage") != null ? request.getParameter("txtReplymessage") : null);

        FeedbackReplyService feedbackReplyService = new FeedbackReplyServiceImpl();

        Object result = feedbackReplyService.save(feedbackReply);

        System.out.println("Instance of Feedback reply : " + (feedbackReply instanceof FeedbackReply));
        if (result instanceof Integer) {
            String message = "Failed to post your reply";
            request.setAttribute("message", message);

            request.getRequestDispatcher("error.jsp").forward(request, response);
        } else if (feedbackReply instanceof FeedbackReply && feedbackReply != null && feedbackReply.getId() != null) {
            // Email Feedback reply
            String message = "Thank you for your reply";
            request.setAttribute("message", message);

            request.getRequestDispatcher("/save_success.jsp").forward(request, response);
        } else {
            String message = "Failed to post your reply";
            request.setAttribute("message", message);

            request.getRequestDispatcher("error.jsp").forward(request, response);

        }

    }

}
