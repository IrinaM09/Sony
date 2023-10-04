package com.innovation.lab.sony.controllers;

import com.innovation.lab.sony.mail.SMTPMail;
import com.innovation.lab.sony.mail.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private MailSender mailSender;

    public MailController(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @GetMapping("/send")
    public void sendMail() {
        mailSender.send("irina", "laur", "notificare", "noapte buna!");
    }
}
