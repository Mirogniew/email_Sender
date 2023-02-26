package com.example.mail_sender.service;

import com.example.mail_sender.model.Email;

import java.util.List;

public interface EmailServiceDTO {

    List<Email> get();

    Email get(int id);

    void save(Email email);

    void delete(int id);
}
