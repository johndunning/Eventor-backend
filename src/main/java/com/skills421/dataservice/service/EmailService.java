package com.skills421.dataservice.service;

import com.skills421.dataservice.mappers.EmailMapper;
import com.skills421.dataservice.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.mail.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class EmailService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private EmailMapper emailMapper;

    public List<Email> readEmails() throws MessagingException, IOException, Exception {
        List<Email> emailMessages = new ArrayList<>();

        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");
        properties.put("mail.imaps.host", "imap.mail.me.com");
        properties.put("mail.imaps.port", "993");
        properties.put("mail.imaps.ssl.protocols", "TLSv1.2");
        Session session = Session.getInstance(properties);

        Store store = session.getStore();
        store.connect("johndunning@mac.com", "fbci-zzmf-pfsr-dvky");

        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        Message[] messages = inbox.getMessages();
        System.out.println("Downloaded " + messages.length);

        int count = 0;
        for (Message message : messages) {

            count++;

            if (count > 20) {
                break;
            }

            Email email = emailMapper.mapMailMessage(message);

            if (email == null) {
                System.err.println("Could not process mailmessage: " + count + ": " + message);
            } else {
                emailMessages.add(email);
            }
        }

        inbox.close(false);
        store.close();

        return emailMessages;
}
}
