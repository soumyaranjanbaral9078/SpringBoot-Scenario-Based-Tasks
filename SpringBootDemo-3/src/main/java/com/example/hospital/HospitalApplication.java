package com.example.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication(scanBasePackages = "com.example")
public class HospitalApplication implements CommandLineRunner {

    @Autowired
    private Hospital hospital;

    public static void main(String[] args) {

        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) {

        hospital.displayHospital();
    }
}