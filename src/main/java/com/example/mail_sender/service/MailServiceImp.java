package com.example.mail_sender.service;

import com.example.mail_sender.DTO.MailDTO;
import com.example.mail_sender.model.Email;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MailServiceImp implements MailDTO {
    @Transactional
    @Override
    public List<Email> get() {
        return null;
    }

    @Transactional
    @Override
    public Email get(int id) {
        return null;
    }

    @Transactional
    @Override
    public void save(Email email) {

    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
