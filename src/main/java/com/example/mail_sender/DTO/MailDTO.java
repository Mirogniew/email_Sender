package com.example.mail_sender.DTO;

import com.example.mail_sender.model.Email;

import java.util.List;

public interface MailDTO {
    List<Email> get();

    Email get(int id);

    void save(Email email);

    void delete(int id);

}
