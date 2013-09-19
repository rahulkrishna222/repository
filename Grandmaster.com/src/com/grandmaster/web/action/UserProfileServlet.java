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
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserProfile user = new UserProfile();

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
        user.setMobileNumber(request.getParameter("txtmob") != null ? Long.valueOf(request.getParameter("txtmob")) : 0);
        System.out.println(">>>>> : "+request.getParameter("txtph"));
        user.setHomeNumber(request.getParameter("txtph") != null ? Long.valueOf(request.getParameter("txtph")) : 0);
        // user.setIsAdmin(isAdmin);

        user = userProfile.save(user);
        if (user.getUserId() != null) {
            // Successfully create a new user
            // now add user to the login table
            Login login = new Login();
            login.setEmail(user.getEmail());
            login.setUserId(user.getUserId());
            String password = String.valueOf(new Random().nextInt());
            System.out.println(">>>>>>>>>>>>>>>>>>>>> : " + password);
            try {
                login.setPasswordHash(GrandmasterUtil.getMD5Hash(password));
            } catch (NoSuchAlgorithmException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            login.setStatus('A');
            LoginService loginService = new LoginServiceImpl();
            login = loginService.save(login);
            if (login != null) {
                // TODO entry added to login table.. User now need to activate his account by login to the system using email
                // we sent to the address and also sent password to email address;
            } else {
                // adding user account to the login table failed
                // rollback the operation
                userProfile.delete(user.getUserId());
                // TODO Return to a error page with msg
            }
        } else {
            // Failed to create a new user
            // TODO return error page with msg
        }

    }

}
