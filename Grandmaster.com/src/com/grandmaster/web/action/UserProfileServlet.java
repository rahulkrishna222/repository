package com.grandmaster.web.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.grandmaster.db.entity.UserProfile;
import com.grandmaster.db.service.UserProfileService;
import com.grandmaster.db.service.impl.UserProfileServiceImpl;

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
                List<Object> users = userProfile.findAll(start, count);
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
        
    }

}
