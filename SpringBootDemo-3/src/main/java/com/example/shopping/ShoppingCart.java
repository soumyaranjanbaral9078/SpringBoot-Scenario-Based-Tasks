package com.example.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
private Product product;
private Customer customer;
private Payment payment;
@Autowired
public ShoppingCart(Product product, Customer customer, Payment payment) {
	super();
	this.product = product;
	this.customer = customer;
	this.payment = payment;
}
public void displayShpppingCart() {
	System.out.println("Welcome to Online Shopping");
	product.displayProduct();
	customer.displayCustomer();
	payment.displayPayment();
	System.out.println("Shopping cart initialized successfully!!");
}
}
