package com.grandmaster.web.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.entity.UserProfile;
import com.grandmaster.db.service.LoginService;
import com.grandmaster.db.service.UserProfileService;
import com.grandmaster.db.service.impl.LoginServiceImpl;
import com.grandmaster.db.service.impl.UserProfileServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private LoginService      loginService;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        loginService = new LoginServiceImpl();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = (String) request.getAttribute("txtUsername");
        String password = (String) request.getAttribute("txtPassword");

        // TODO Validate username and password (do a null check)
        int userId = loginService.validateLogin(username, password, request.getRemoteAddr());

        // If the user is not valid then we will get response -1, other wise the exact userId
        // Now we need to get the user details and store it into the Session, for the time being we only going to store
        // User First Name and userId.

        if (userId != -1) {
            UserProfileService profileService = new UserProfileServiceImpl();
            UserProfile user = profileService.select(userId);
            request.getSession(true).setAttribute("userId", userId);
            request.getSession().setAttribute("Name", user.getFirstName() + " " + user.getLastName());

            request.getRequestDispatcher("/userHome.jsp").forward(request, response);
        } else {
            // redirect user to login page with a validation error
            request.getRequestDispatcher("/loginErrorPage.jsp").forward(request, response);
        }

    }
}
