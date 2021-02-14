package com.example.yebserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.yebserver.mapper")
public class YebServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YebServerApplication.class, args);
    }

}
