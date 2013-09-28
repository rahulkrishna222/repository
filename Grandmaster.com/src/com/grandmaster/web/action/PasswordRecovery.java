package com.grandmaster.web.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.service.UserProfileService;
import com.grandmaster.db.service.impl.UserProfileServiceImpl;
import com.grandmaster.util.EmailSender;

/**
 * Servlet implementation class PasswordRecovery
 */

public class PasswordRecovery extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordRecovery() {
        super();
        // TODO Auto-generated constructor stub
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
        // TODO Auto-generated method stub
        String email = request.getParameter("txtUsername");
        UserProfileService userProfileService = new UserProfileServiceImpl();
        String uuid = userProfileService.retrievePassword(email, request.getRemoteAddr());
        if (uuid != null) {
            EmailSender emailSender = new EmailSender();
            Map<String, String> data = new HashMap<String, String>();
            data.put("user", email.replaceAll("@.*", ""));
            data.put("UUID", uuid);
            emailSender.sendEmailMessage(email, EmailSender.PASSWORD_RECOVERY, data);
            
            String message = "We have sent password reset link to your registerd email address";
            request.setAttribute("message", message);
            
            request.getRequestDispatcher("/save_success.jsp").forward(request, response);
        }else{
            String message = "Something went wrong please try again";
            request.setAttribute("message", message);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

}
