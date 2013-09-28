package com.grandmaster.web.action;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.grandmaster.db.entity.Login;
import com.grandmaster.db.entity.UserList;
import com.grandmaster.db.entity.UserProfile;
import com.grandmaster.db.service.LoginService;
import com.grandmaster.db.service.UserProfileService;
import com.grandmaster.db.service.impl.LoginServiceImpl;
import com.grandmaster.db.service.impl.UserProfileServiceImpl;
import com.grandmaster.util.GrandmasterUtil;

/**
 * Servlet implementation class UserProfileServlet
 */
public class UserProfileServlet extends HttpServlet {
    private static final long  serialVersionUID = 1L;

    private Log                logger           = LogFactory.getLog(UserProfileServlet.class);

    private UserProfileService userProfile;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserProfileServlet() {
        super();
        userProfile = new UserProfileServiceImpl();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String isNeedAllRecord = request.getParameter("all");

        if (request.getSession(false) == null && request.getSession(false).getAttribute("userId") == null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        if (isNeedAllRecord != null && Boolean.valueOf(isNeedAllRecord)) {

            int count = -1;
            int start = -1;

            try {
                count = Integer.parseInt(request.getParameter("count"));
            } catch (NullPointerException | NumberFormatException e) {
                count = 20;
            }

            try {
                start = Integer.parseInt(request.getParameter("start"));
            } catch (NullPointerException | NumberFormatException e) {
                start = 0;
            }

            try {
                List<UserProfile> users = (List<UserProfile>) userProfile.findAll(start, count);
                if (users != null && !users.isEmpty()) {
                    UserList userList = new UserList();
                    userList.setUserProfileList(users);
                    request.setAttribute("userList", userList);

                    request.getRequestDispatcher("/userListing.jsp").forward(request, response);

                }
            } catch (SQLException e) {
                // TODO Log messages and handle exception
                e.printStackTrace();
            }
        } else if (request.getParameter("id") != null) {
            int uid = -1;
            try {
                uid = Integer.parseInt(request.getParameter("id"));
            } catch (NumberFormatException nfe) {
                // TODO Write log message and handle exception
                nfe.printStackTrace();
            } catch (Exception e) {
                // TODO Write log message and handle exception
                e.printStackTrace();
            }

            UserProfile user = (UserProfile) userProfile.select(uid);
            if (user != null) {
                request.setAttribute("user", user);
                if (user.isAdmin())
                    request.getRequestDispatcher("/adminProfile.jsp").forward(request, response);
                else
                    request.getRequestDispatcher("/profile.jsp").forward(request, response);
            }
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserProfile user = new UserProfile();
        if (request.getSession().getAttribute("userId") != null) {

            if (request.getSession().getAttribute("isAdmin") != null) {
                user.setIsAdmin('Y');
            } else {
                user.setIsAdmin('N');
            }
            user.setFirstName(request.getParameter("txtfname"));
            user.setLastName(request.getParameter("txtlname"));
            // gender
            // user.setDob(dob);
            user.setEmail(request.getParameter("txtemail"));
            user.setAddress1(request.getParameter("txtAaddr1"));
            user.setAddress2(request.getParameter("txtAaddr1"));
            user.setCity(request.getParameter("txtcity"));
            user.setState(request.getParameter("txtstate"));
            user.setZipCode(request.getParameter("txtzip"));
            // user.setCountry(country);
            user.setMobileNumber(request.getParameter("txtmob") != null ? request.getParameter("txtmob") : "");
            System.out.println(">>>>> : " + request.getParameter("txtph"));
            user.setHomeNumber(request.getParameter("txtph") != null ? request.getParameter("txtph") : "");
            // user.setIsAdmin(isAdmin);

            user = userProfile.update(user, Integer.parseInt(request.getSession().getAttribute("userId").toString()));
            if (user != null && user.getUserId() != null) {
                request.setAttribute("user", user);
                request.getRequestDispatcher("profile.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "Unhandled exception occured");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
    }

}
