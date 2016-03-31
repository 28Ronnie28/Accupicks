/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.server;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

public class Email {

    public void emailPassword(String username, String email, String password) {
        /*
        Properties props;
        Session session = Session.getInstance(props, null);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", "swooosh.apps", "swoosh.appspassword");
        MimeMessage message = new MimeMessage(session);
        message.setRecipient(Message.RecipientType.TO, new);
        transport.sendMessage(message, message.getAllRecipients());
         */
    }

}
