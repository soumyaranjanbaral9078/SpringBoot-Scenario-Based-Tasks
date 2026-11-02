package com.example.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoodOrder {

    private Restaurant restaurant;
    private Menu menu;
    private DeliveryPartner deliveryPartner;

    @Autowired
    public FoodOrder(Restaurant restaurant, Menu menu,
                     DeliveryPartner deliveryPartner) {

        this.restaurant = restaurant;
        this.menu = menu;
        this.deliveryPartner = deliveryPartner;
    }

    public void placeOrder() {

        System.out.println("Welcome to Online Food Delivery System");

        restaurant.displayRestaurant();

        menu.displayMenu();

        deliveryPartner.displayDeliveryPartner();

        System.out.println("Your food order is successfully placed!");
    }
}