package com.grandmaster.web.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.service.UserProfileService;
import com.grandmaster.db.service.impl.UserProfileServiceImpl;

/**
 * Servlet implementation class PasswordRetrievalServlet
 */
@WebServlet("/PasswordRetrievalServlet")
public class PasswordRetrievalServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordRetrievalServlet() {
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

        String email = request.getAttribute("email") != null ? request.getAttribute("txtEmail").toString() : null;

        if (email != null && !email.isEmpty()) {
            UserProfileService userProfileService = new UserProfileServiceImpl();

            boolean isSuccess = userProfileService.retrievePassword(email, request.getRemoteAddr());
            
            if (!isSuccess){
                // A user with given email not exists
                // Forward with a message to notice that email not exists.
                // TODO
            } else{
                // Initiated process to retrieve password
            }
        } else {
            // TODO : Write log message and forward to error page
        }

    }
}
