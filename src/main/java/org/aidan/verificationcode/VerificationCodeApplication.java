package org.aidan.verificationcode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"org.aidan.*.mapper*"})
@SpringBootApplication
public class VerificationCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(VerificationCodeApplication.class, args);
    }
}
