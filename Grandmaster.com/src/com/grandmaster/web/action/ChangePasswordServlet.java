package com.grandmaster.web.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.entity.Login;
import com.grandmaster.db.entity.UserProfile;
import com.grandmaster.db.service.LoginService;
import com.grandmaster.db.service.UserProfileService;
import com.grandmaster.db.service.impl.LoginServiceImpl;
import com.grandmaster.db.service.impl.UserProfileServiceImpl;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String UUID = request.getParameter("UUID");

        if (UUID != null) {
            request.setAttribute("UUID", UUID);
            request.getRequestDispatcher("/changePassword.jsp").forward(request, response);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserProfileService userProfileService = new UserProfileServiceImpl();
        Integer userId = null;
        
        boolean isPasswordReset = false;
        
        if (request.getSession().getAttribute("userId") != null && request.getParameter("UUID") == null) {
            userId = Integer.parseInt(request.getSession().getAttribute("userId").toString());
        } else if (request.getParameter("txtUUID") != null) {
            String UUID = request.getParameter("txtUUID");
            isPasswordReset = true;
            userId = userProfileService.recoverPassword(UUID);
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

        // TODO if uid == null then redirect to login expired page or login page, write code

        UserProfile user = userProfileService.select(userId);

        String email = request.getParameter("txtEmail") != null ? request.getParameter("txtEmail").toString() : null;

        String password = request.getParameter("txtCurrentPswd") != null ? request.getParameter("txtCurrentPswd").toString() : null;
        
        if (isPasswordReset){
            LoginService loginService = new LoginServiceImpl();
            Login login = loginService.select(userId);
            password = login.getPasswordHash();
        }

        String newPassword = request.getParameter("txtNewPswd") != null ? request.getParameter("txtNewPswd").toString() : null;

        String confPassword = request.getParameter("txtConfPswd") != null ? request.getParameter("txtConfPswd").toString() : null;

        if (!newPassword.equals(confPassword)) {
            String message = " New password and confirmed password are not matching.";
            request.setAttribute("message", message);

            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }

        if (user.isAdmin()) {
            // admin can change password of any user
            userProfileService.changePassword(email, password, newPassword, true);
        } else {

            if (email.equalsIgnoreCase(user.getEmail())) {
                // The user trying to change his password
                int changeResponseCode = userProfileService.changePassword(email, password, newPassword, false);
                /*
                 * 1 --> User password changed successfully
                 * -1 --> Current password is wrong
                 * 2 --> New password is in the last 3 password
                 * 0 -->
                 */

                String message = "";
                if (changeResponseCode == 1) {
                    message = " Your password has been succesfully changed";
                    request.setAttribute("message", message);

                    request.getRequestDispatcher("/save_success.jsp").forward(request, response);
                } else if (changeResponseCode == -1) {
                    message = "The Current password you enterd is wrong, try again, click <a href='changePassword.jsp'> here </a> to try again ";
                    request.setAttribute("message", message);

                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                } else if (changeResponseCode == 2) {
                    message = "You can't set your last 3 password as new password, try another, click <a href='changePassword.jsp'> here </a> to try again ";
                    request.setAttribute("message", message);

                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                }
                // TODO : Write Code for Forward page with set a message variable with appropriate message

            } else {
                // User trying to change password of someother user.
                // And its not allowed and only admin can do this operation
                // Access Denied

                String message = "Access Denied";
                request.setAttribute("message", message);

                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }

        }

    }
}
