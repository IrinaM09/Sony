package com.innovation.lab.sony.mail;

public interface MailSender {

     void send(String from, String to, String subject, String body);
}
