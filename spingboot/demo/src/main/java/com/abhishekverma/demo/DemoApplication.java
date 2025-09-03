package com.abhishekverma.demo;

import com.abhishekverma.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = "com.abhishekverma")
public class DemoApplication implements CommandLineRunner {
    @Autowired
    OwnerService service;

    @Autowired
    OwnerService service1;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(service.findOwner());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  id");
        service1.setId(sc.nextInt());
        System.out.println(service.findOwner());
        System.out.println(service1.findOwner());

    }
}
