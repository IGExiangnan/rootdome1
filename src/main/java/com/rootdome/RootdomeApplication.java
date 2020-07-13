package com.rootdome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@MapperScan("com.rootdome.generator.mapper")
public class RootdomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RootdomeApplication.class, args);
    }

}


