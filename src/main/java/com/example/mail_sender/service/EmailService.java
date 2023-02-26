package com.example.mail_sender.service;

import com.example.mail_sender.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmailService implements EmailServiceDTO{
    @Autowired
    private EmailServiceDTO emailDTO;
    @Transactional
    public List<Email> get() {
        return emailDTO.get();
    }

    @Transactional
    public Email get(int id) {
        return null;
    }

    @Transactional
    public void save(Email email) {

    }

    @Transactional
    public void delete(int id) {

    }
}
