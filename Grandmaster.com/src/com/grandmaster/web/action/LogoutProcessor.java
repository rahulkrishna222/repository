package com.grandmaster.web.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.service.LoginService;
import com.grandmaster.db.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class LogoutProcessor
 */

public class LogoutProcessor extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutProcessor() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer userId = null;
        if (request.getSession(false) != null) {
            userId = Integer.parseInt(request.getSession(false).getAttribute("userId").toString());
        } else {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        LoginService loginService = new LoginServiceImpl();

        if (loginService.removeUserFromOnlineList(userId)) {
            System.out.println("User removed from online user list");
        } else {
            System.out.println("Can't remove User from  online user list");
        }
        request.getSession(false).invalidate();
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}
