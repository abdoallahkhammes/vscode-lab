package com.example;

import java.util.List;

public class OrderProcessor {

    public double printOrderSummary(Order order) {
        double totalPrice = 0;
        for (Item item : order.getItems()) {
            totalPrice += item.getPrice() * item.getQuantity();
        }

        if (order.getCustomer().isMember()) {
            totalPrice *= 0.9;
        }

        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.printf("Total: $%.2f%n", totalPrice);

        return totalPrice;
    }
}
