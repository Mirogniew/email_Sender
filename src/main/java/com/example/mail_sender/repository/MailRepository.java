package com.example.mail_sender.repository;

import com.example.mail_sender.DTO.MailDTO;
import com.example.mail_sender.model.Email;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MailRepository implements MailDTO {
    @Override
    public List<Email> get() {
        return null;
    }

    @Override
    public Email get(int id) {
        return null;
    }

    @Override
    public void save(Email email) {

    }

    @Override
    public void delete(int id) {

    }
}
