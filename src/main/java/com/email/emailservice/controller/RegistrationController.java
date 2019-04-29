package com.email.emailservice.controller;


import com.email.emailservice.model.Email;
import com.email.emailservice.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegistrationController {

    @Autowired
    private MailService notificationService;

   // @Autowired
    //private Email email;





    @PostMapping("/email/sendEmail")
     public  String sendEmailWithoutAttachment(@RequestBody Email email) {
        try {
            notificationService.sendEmailWithoutAttachment(email);
            return "Email Sent!";
        }catch(Exception ex) {
            return "Error in sending email: "+ex;
        }
    }

    /**
     *
     * @return
     * @throws MessagingException
     */
//    @RequestMapping("send-mail-attachment")
//    public String sendWithAttachment() throws MessagingException {
//
//        /*
//         * Creating a Email with the help of Email class that we have declared and setting
//         * Email address of the sender.
//         */
//        email.setEmailAddress("mukul.jaiswal786@gmail.com"); //Receiver's email address
//
//        /*
//         * Here we will call sendEmailWithAttachment() for Sending mail to the sender
//         * that contains a attachment.
//         */
//        try {
//            notificationService.sendEmailWithAttachment(email);
//        } catch (MailException mailException) {
//            System.out.println(mailException);
//        }
//        return "Congratulations! Your mail has been send to the email.";
//    }
}