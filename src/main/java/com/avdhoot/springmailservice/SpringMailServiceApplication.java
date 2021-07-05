package com.avdhoot.springmailservice;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringMailServiceApplication {

	// @Autowired
	// private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(SpringMailServiceApplication.class, args);
	}

	// @EventListener(ApplicationReadyEvent.class)
	// public void triggerMail() throws MessagingException{
	// 	//service.sendSimpleMail("durgeshjadhav1018@gmail.com", "Hello bro", "demo");
	// 	service.mailWithAttachments("avdhootjadhav002@gmail.com", "Hello bro! Pls check out the image I have sended you", "Spring Mail Service", "/home/avdhoot/Downloads/aot.jpg");
	// }

}
