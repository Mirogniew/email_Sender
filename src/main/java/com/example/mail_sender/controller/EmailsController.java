package com.example.mail_sender.controller;

import com.example.mail_sender.model.Email;
import com.example.mail_sender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emails")
public class EmailsController {
    @Autowired
    private EmailService emailService;

    @GetMapping("/get-all")
    public List<Email> get() {
        return emailService.get();
    }
}
