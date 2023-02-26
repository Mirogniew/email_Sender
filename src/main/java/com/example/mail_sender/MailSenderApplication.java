package com.example.mail_sender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
		/*Session session = null;

		Emails newMail = new Emails();
		newMail.setId(99);
		newMail.setEmail("poland@mail.com");

		session.save(newMail);*/
	}

}
