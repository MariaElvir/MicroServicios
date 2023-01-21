package com.certus.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.certus.demo.model.entity"})
@SpringBootApplication
public class DemoUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoUsuariosApplication.class, args);
    }

}
