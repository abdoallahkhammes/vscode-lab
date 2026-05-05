package com.example;

import java.util.List;

public class OrderProcessor {

    public double printOrderSummary(Order order) {
        double totalPrice = calculateTotalPrice(order);

        totalPrice = applyDiscount(order, totalPrice);

        printSummary(order, totalPrice);

        return totalPrice;
    }

    private static void printSummary(Order order, double totalPrice) {
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.printf("Total: $%.2f%n", totalPrice);
    }

    private static double applyDiscount(Order order, double totalPrice) {
        if (order.getCustomer().isMember()) {
            totalPrice *= 0.9;
        }
        return totalPrice;
    }

    private static double calculateTotalPrice(Order order) {
        double totalPrice = 0;
        for (Item item : order.getItems()) {
            totalPrice += item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }
}
