package com.grandmaster.web.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.connection.DBConnector;
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
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBConnector connector = (DBConnector) request.getServletContext().getAttribute("DB_Connector");
        connector.createConnection();
        // / feedbackService.
    }

}
