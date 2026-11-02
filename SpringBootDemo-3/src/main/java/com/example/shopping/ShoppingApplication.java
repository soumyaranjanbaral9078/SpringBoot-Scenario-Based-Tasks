package com.example.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication(scanBasePackages = "com.example.shopping")
public class ShoppingApplication implements CommandLineRunner {

    @Autowired
    private ShoppingCart shoppingCart;

    public static void main(String[] args) {

        SpringApplication.run(ShoppingApplication.class, args);
    }

    @Override
    public void run(String... args) {

        shoppingCart.displayShpppingCart();
    }
}