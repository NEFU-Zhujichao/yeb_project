package com.example.yebserver;

import com.example.yebserver.config.security.JwtTokenUtil;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.HashMap;

@SpringBootTest
class YebServerApplicationTests {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Test
    void contextLoads() {
        String encode = passwordEncoder.encode("123");
        System.out.println(encode);
        String SECRET = "secret";

        HashMap map = new HashMap<>();

        map.put("role","admin");

        map.put("username", "chao");

        String jwt = Jwts.builder()

                .setClaims(map)

                .setExpiration(new Date(System.currentTimeMillis() + 100*1000))

                .signWith(SignatureAlgorithm.HS512, SECRET)

                .compact();
        System.out.println(jwt);
    }

}
