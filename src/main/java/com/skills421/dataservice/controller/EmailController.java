package com.skills421.dataservice.controller;

import com.skills421.dataservice.DummyDate;
import com.skills421.dataservice.model.Email;
import com.skills421.dataservice.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmailController
{
    @Autowired
    private final EmailService emailService;

    @GetMapping("/emails")
    public List<Email> getAllData() throws Exception {
        return emailService.readEmails();
    }
}
