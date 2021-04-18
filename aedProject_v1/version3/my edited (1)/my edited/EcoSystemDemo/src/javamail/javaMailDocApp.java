/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamail;

import javax.mail.Authenticator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author Akanksha
 */
public class javaMailDocApp {
     public static void sendMail(String recepient) {
        System.out.println("Preparing mail message");
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        // mail.smtp.auth
        //mail.smtp.starttls.enable
        //mail.smtp.host- smtp.gmail.com
        //mail.smtp.port- 587    
        
        
        String myAccountEmail="healthfirst202004@gmail.com";
        String pwd="Anushi@123";
        
        Session session= Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail,pwd); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        Message message = prepareMessage(session,myAccountEmail,recepient);
        try {
            Transport.send(message);
        } catch (MessagingException ex) {
            Logger.getLogger(javamailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Message sent");
    }
    
    private static Message prepareMessage(Session session, String myAccountEmail, String recepient){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Doctor's appointment has been scheduled");
            message.setText("Your appointment with the doctor is scheduled. \nPlease contact the hospital for more details.");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(javamailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
