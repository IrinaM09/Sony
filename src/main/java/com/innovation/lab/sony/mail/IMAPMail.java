package com.innovation.lab.sony.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("imapMail")
public class IMAPMail implements MailSender {
    private static Log log =  LogFactory.getLog(MailSender.class);
    @Override
    public void send(String from, String to, String subject, String body) {
        log.info("[send] from: " + from);
        log.info("[send] to: " + to);
        log.info("[send] subject: " + subject);
        log.info("[send] body: " + body);
    }
}
