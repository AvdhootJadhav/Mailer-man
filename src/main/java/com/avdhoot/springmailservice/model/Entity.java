package com.avdhoot.springmailservice.model;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Entity {
    
    private String toEmail;
    private String subject;
    private String body;
    private MultipartFile file;
}
