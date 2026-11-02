/*package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.component.FoodOrder;
import com.example.hospital.Hospital;

@SpringBootApplication
public class OnlineFoodDeliveryApplication implements CommandLineRunner {

    @Autowired
    private FoodOrder foodOrder;

    @Autowired
    private Hospital hospital;

    public static void main(String[] args) {

        SpringApplication.run(OnlineFoodDeliveryApplication.class, args);
    }

    @Override
    public void run(String... args) {

        foodOrder.placeOrder();

        System.out.println();

        hospital.displayHospital();
    }
}*/