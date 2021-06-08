package com.example.yebmail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

@Service
public class SendEmailService {

    @Autowired
    private JavaMailSender sender;
    @Autowired
    private TemplateEngine templateEngine;
    @Autowired
    private MailProperties mailProperties;

    public void sendMultipartEmail(){
        MimeMessage message = sender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setFrom(mailProperties.getUsername());
            // 812352374
            helper.setTo("812352374@qq.com");
            helper.setSubject("大连华宇公司");
            helper.setSentDate(new Date());
            Context context = new Context();
            context.setVariable("name","钮丽俊");
            context.setVariable("posName","666");
            context.setVariable("joblevelName","FW");
            context.setVariable("departmentName","9A309");
            String mail = templateEngine.process("mail", context);
            helper.setText(mail,true);
            sender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
