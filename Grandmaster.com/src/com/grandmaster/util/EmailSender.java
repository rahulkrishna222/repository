package com.grandmaster.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {

    public final static String PASSWORD_RECOVERY     = "PR";
    public final static String NEW_USER_REGISTRATION = "NR";

    private final String        SMTP_HOST             = "smtp.gmail.com";
    private final String        SMTP_PORT             = "587";
    private final String        USER_NAME             = "grandmaster.chess.website@gmail.com";
    private final String        PASSWORD              = "9447435266";
    private final Properties    props;

    public EmailSender() {
        props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", SMTP_HOST);
        props.put("mail.smtp.port", SMTP_PORT);
        props.put("mail.smtp.user", USER_NAME);
        props.put("mail.smtp.password", PASSWORD);
    }

    private boolean sendEmail(String toEmailAddress, String type, Map<String, String> data) {

        Session session = Session.getInstance(props, new Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(USER_NAME, PASSWORD);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(USER_NAME));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress));
            String text = "Dear "+data.get("user");
            if (type.equals(PASSWORD_RECOVERY)) {
                message.setSubject("Password Recovery");
                text += "\n\nPlease click the below link to Recover user password : localhost:8080\\passwordReset.html?UUID="+data.get("UUID");
                message.setText(text);
            }else if(type.equals(NEW_USER_REGISTRATION)){
                text += "\n\n\n\n Hi "+data.get("user") + "\n\n Welcome to Grandmaster.com, please <a href='localhost:8080\\Grandmaster.com'>  click here to start play </a>";
                message.setSubject("Welcome to Grandmaster.com");
                message.setText(text);
            }else{
                message.setSubject("Notification");               
            }

            Transport.send(message);

            System.out.println("Done");

            return true;
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean sendEmailMessage(String email, String type, Map<String, String> data){
        return sendEmail(email, type, data);
    }
    // for testing only
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<String, String>();
        data.put("user", "Rahul");
        new EmailSender().sendEmail("rahulkrishna222@gmail.com", EmailSender.NEW_USER_REGISTRATION, data);
    }
}
