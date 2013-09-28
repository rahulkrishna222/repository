package com.grandmaster.web.action;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
import com.grandmaster.util.EmailSender;
import com.grandmaster.util.GrandmasterUtil;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

    UserProfileService        userProfileService = null;
    private static final long serialVersionUID   = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        userProfileService = new UserProfileServiceImpl();
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
        // TODO Auto-generated method stub

        UserProfile user = new UserProfile();

        user.setFirstName(request.getParameter("txtFname"));
        user.setLastName(request.getParameter("txtLname"));
        user.setMobileNumber(request.getParameter("txtMob") != null ? request.getParameter("txtMob") : "");
        user.setHomeNumber(request.getParameter("txtPhone") != null ? request.getParameter("txtPhone") : "");
        user.setEmail(request.getParameter("txtEmail"));
        user.setCountry(request.getParameter("ddlCountry"));

        String uName = request.getParameter("txtUname");
        String captcha = request.getParameter("txtCaptcha");
        String password = request.getParameter("txtPswd");
        String confPswd = request.getParameter("txtConpswd");
        String dobDay = request.getParameter("ddlDay");
        String dobMonth = request.getParameter("ddlMonth");
        String dobYear = request.getParameter("ddlYear");
        String sex = request.getParameter("ddlSex");

        user.setIsAdmin('N');

        user = userProfileService.save(user);

        if (user != null && user.getUserId() != null) {
            // Successfully create a new user
            // now add user to the login table
            Login login = new Login();
            login.setEmail(user.getEmail());
            login.setUserId(user.getUserId());

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
                
                EmailSender emailSender = new EmailSender();
                Map<String, String> data = new HashMap<String, String>();
                data.put("user", user.getFirstName()+ " "+user.getLastName());
                emailSender.sendEmailMessage(user.getEmail(), EmailSender.NEW_USER_REGISTRATION, data);
                request.getSession(true).setAttribute("userId", user.getUserId());
                request.getSession().setAttribute("uName", user.getEmail());
                request.getSession().setAttribute("name", user.getFirstName() + " " + user.getLastName());

                request.getRequestDispatcher("/home.jsp").forward(request, response);
            } else {
                // adding user account to the login table failed
                // roleback the operation
                userProfileService.delete(user.getUserId());
                // Return to a error page with msg
                String messeage = "Sorry " + user.getFirstName()
                        + " there is some problem occured while saving your account please try again after sometime";
                request.getRequestDispatcher("error.jsp").forward(request, response);
                request.setAttribute("message", messeage);
            }
        } else {
            String messeage = "Sorry user there is some problem occured while saving your account please try again after sometime";
            request.setAttribute("message", messeage);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }
    /*
     * protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     * 
     * UserProfile user = new UserProfile();
     * 
     * user.setFirstName(request.getParameter("txtfname"));
     * user.setLastName(request.getParameter("txtlname"));
     * // gender
     * // user.setDob(dob);
     * user.setEmail(request.getParameter("txtemail"));
     * user.setAddress1(request.getParameter("txtAaddr1"));
     * user.setAddress2(request.getParameter("txtAaddr1"));
     * user.setCity(request.getParameter("txtcity"));
     * user.setState(request.getParameter("txtstate"));
     * user.setZipCode(request.getParameter("txtzip"));
     * // user.setCountry(country);
     * user.setMobileNumber(request.getParameter("txtmob") != null ? Long.valueOf(request.getParameter("txtmob")) : 0);
     * System.out.println(">>>>> : "+request.getParameter("txtph"));
     * user.setHomeNumber(request.getParameter("txtph") != null ? Long.valueOf(request.getParameter("txtph")) : 0);
     * // user.setIsAdmin(isAdmin);
     * 
     * user = userProfile.save(user);
     * if (user.getUserId() != null) {
     * // Successfully create a new user
     * // now add user to the login table
     * Login login = new Login();
     * login.setEmail(user.getEmail());
     * login.setUserId(user.getUserId());
     * String password = String.valueOf(new Random().nextInt());
     * System.out.println(">>>>>>>>>>>>>>>>>>>>> : " + password);
     * try {
     * login.setPasswordHash(GrandmasterUtil.getMD5Hash(password));
     * } catch (NoSuchAlgorithmException e) {
     * // TODO Auto-generated catch block
     * e.printStackTrace();
     * }
     * login.setStatus('A');
     * LoginService loginService = new LoginServiceImpl();
     * login = loginService.save(login);
     * if (login != null) {
     * // TODO entry added to login table.. User now need to activate his account by login to the system using email
     * // we sent to the address and also sent password to email address;
     * } else {
     * // adding user account to the login table failed
     * // rollback the operation
     * userProfile.delete(user.getUserId());
     * // TODO Return to a error page with msg
     * }
     * } else {
     * // Failed to create a new user
     * // TODO return error page with msg
     * }
     * 
     * }
     */
}
