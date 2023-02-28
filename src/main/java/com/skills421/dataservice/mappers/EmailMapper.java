package com.skills421.dataservice.mappers;

import com.skills421.dataservice.model.Email;
import com.skills421.dataservice.utils.DateUtils;
import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

@Component
public class EmailMapper {

    private static int count = 100;
    public Email mapMailMessage(Message message) throws Exception {

        try {
            if (message instanceof MimeMessage) {
                MimeMessage mimeMessage = (MimeMessage) message;
                System.out.println("Mapping mimemessage: "+count);

                SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                Email email = Email.builder()
                        .id(count++)
                        .type("email")
                        .title(mimeMessage.getSubject())
                        .text(mimeMessage.getContent().toString())
                        .from(mimeMessage.getFrom() != null ? List.of(Arrays.toString(mimeMessage.getFrom())).get(0) : null)
                        .date(mimeMessage.getSentDate().toInstant().toEpochMilli())
                        .build();

                return email;
            }

            return null;
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
            System.err.println(message);
        }

        return null;
    }
}
