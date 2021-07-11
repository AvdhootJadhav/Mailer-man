package com.avdhoot.springmailservice;

import java.io.File;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sendmail")
public class controller {
    
    @Autowired
    private EmailSenderService service;

    @PostMapping("/simple")
    public String simplemail(@RequestBody entity en){
        service.sendSimpleMail(en.getToEmail(), en.getBody(), en.getSubject());
        return "Simple Mail send";
    }

    @PostMapping("/advance")
    public String advancemail(@RequestBody entity en) throws MessagingException{
        FileSystemResource reource = getFile(en.getAttachment());
        service.mailWithAttachments(en.getToEmail(), en.getBody(), en.getSubject(), reource);
        return "Attachment Mail send";
    }

    public FileSystemResource getFile(String link){
        FileSystemResource resource = new FileSystemResource(new File(link));
        return resource;
    }
}
