/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.server;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {

    public int emailPassword(String username, String email, String password, int numConnection) {
        try {
            Properties props = System.getProperties();
            props.put("mail.smtp.starttls.enable", true);
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.user", "swooosh.apps@gmail.com");
            props.put("mail.smtp.password", "swoosh.appspassword");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", true);
            Session session = Session.getInstance(props, null);
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", "swooosh.apps", "swooosh.appspassword");
            MimeMessage message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject("Accupicks - Forgot password");
            message.setText("You requested to send your Accupicks password to your email. If this wasn't you please contact us.\nPassword:\t" + password);
            transport.sendMessage(message, message.getAllRecipients());
            return 1;
        } catch (Exception ex) {
            System.out.println("Server> Connection " + numConnection + "> " + ex);
            return -1;
        }
    }
}
