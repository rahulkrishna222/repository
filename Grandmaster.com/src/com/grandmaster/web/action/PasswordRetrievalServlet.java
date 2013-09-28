package com.grandmaster.web.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.entity.UserProfile;
import com.grandmaster.db.service.UserProfileService;
import com.grandmaster.db.service.impl.UserProfileServiceImpl;

/**
 * Servlet implementation class PasswordRetrievalServlet
 */
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
        if (request.getParameter("UUID") != null){
            String UUID = request.getParameter("UUID");
            
            UserProfileService profileService = new UserProfileServiceImpl();
            Integer userId = profileService.recoverPassword(UUID);
            if (userId != null){
                
                UserProfile user = profileService.select(userId);
                
                if (user != null){
                    request.setAttribute("UUID", UUID);
                    request.setAttribute("email", user.getEmail());
                    request.getRequestDispatcher("/changePassword.jsp").forward(request, response);
                }else{
                    String message = "Unable to retirve user details please try again";
                    request.setAttribute("message", message);
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                }
            }else{
                String message = "The URL you trying to reset password is expired, create a new request";
                request.setAttribute("message", message);
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getAttribute("email") != null ? request.getAttribute("txtEmail").toString() : null;

        if (email != null && !email.isEmpty()) {
            UserProfileService userProfileService = new UserProfileServiceImpl();

            String uuid = userProfileService.retrievePassword(email, request.getRemoteAddr());
            
            if (uuid != null){
                
                // TODO
            } else{
                // Initiated process to retrieve password
            }
        } else {
            // TODO : Write log message and forward to error page
        }

    }
}
