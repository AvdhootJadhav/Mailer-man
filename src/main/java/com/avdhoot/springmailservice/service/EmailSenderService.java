package com.avdhoot.springmailservice.service;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EmailSenderService {
    
    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleMail(String toEmail, String body, String subject){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("avdhoottest@gmail.com");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
        System.out.println("Mail sent");
    }

    public void mailWithAttachments(String toEmail, String body, String subject, MultipartFile file) throws MessagingException, IOException{
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(message,true);

        messageHelper.setFrom("avdhoottest@gmail.com");
        messageHelper.setTo(toEmail);
        messageHelper.setSubject(subject);
        messageHelper.setText(body);
        Multipart multipart = new MimeMultipart();
        MimeBodyPart attach = new MimeBodyPart();
        attach.setContent(file.getBytes(), file.getContentType());
        attach.setFileName(file.getOriginalFilename());
        attach.setDisposition(Part.ATTACHMENT);
        multipart.addBodyPart(attach);
        message.setContent(multipart);
        mailSender.send(message);
        System.out.println("Mail sent with attachment");
    }
}
