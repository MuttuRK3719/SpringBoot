package com.abhishekverma.demo;

import com.abhishekverma.service.OwnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication(scanBasePackages = "com.abhishekverma")
public class DemoApplication implements CommandLineRunner {
    @Autowired
    OwnerService service;
    private final static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(service.findOwner());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  id");
        service.setId(sc.nextInt());
        logger.info(service.findOwner());
    }
}
