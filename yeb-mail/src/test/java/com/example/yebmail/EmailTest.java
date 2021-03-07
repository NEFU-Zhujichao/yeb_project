package com.example.yebmail;

import com.example.yebmail.service.SendEmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailTest {

    @Autowired
    private SendEmailService service;

    @Test
    public void emailTest(){
        service.sendMultipartEmail();
    }
}
