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
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int userId = Integer.parseInt(request.getSession().getAttribute("userId").toString());

        // TODO if uid == null then redirect to login expired page or login page, write code

        UserProfileService userProfileService = new UserProfileServiceImpl();

        UserProfile user = userProfileService.select(userId);

        String email = request.getAttribute("txtUserEmail") != null ? request.getAttribute("txtUserEmail").toString() : null;

        String password = request.getAttribute("txtPassword") != null ? request.getAttribute("txtPassword").toString() : null;

        String newPassword = request.getAttribute("txtNewPassword") != null ? request.getAttribute("txtNewPassword").toString()
                : null;

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

                // TODO : Write Code for Forward page with set a message variable with appropriate message

            } else {
                // User trying to change password of someother user.
                // And its not allowed and only admin can do this operation
                // TODO Write code to Access Denied
            }

        }

    }
}
