package com.grandmaster.web.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.entity.UserList;
import com.grandmaster.db.service.UserProfileService;
import com.grandmaster.db.service.impl.UserProfileServiceImpl;

/**
 * Servlet implementation class OnlineUsers
 */
public class OnlineUsers extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public OnlineUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getSession(false) == null && request.getSession(false).getAttribute("userId") == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

        UserProfileService userProfileService = new UserProfileServiceImpl();

        UserList onlineUsers = userProfileService.getOnlineUserList();

        request.setAttribute("onlineUsers", onlineUsers);

        request.getRequestDispatcher("/onlineUser.jsp").forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}
