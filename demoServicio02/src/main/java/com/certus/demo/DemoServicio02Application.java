package com.certus.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoServicio02Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoServicio02Application.class, args);
    }

}
