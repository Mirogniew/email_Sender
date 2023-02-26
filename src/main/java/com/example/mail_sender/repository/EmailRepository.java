package com.example.mail_sender.repository;

import com.example.mail_sender.DTO.EmailDTO;
import com.example.mail_sender.model.Email;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmailRepository implements EmailDTO {
    private SessionFactory sessionFactory;

    @Override
    public List<Email> get() {
        Session currentSession = sessionFactory.unwrap(Session.class);
        Query<Email> query = currentSession.createQuery("from Email", Email.class);
        return query.getResultList();
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
