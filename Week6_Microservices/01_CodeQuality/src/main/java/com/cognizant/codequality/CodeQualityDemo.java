package com.cognizant.codequality;

public class CodeQualityDemo {

    public static void main(String[] args) {
        CodeQualityDemo demo = new CodeQualityDemo();
        demo.processOrder(101, 250.50);
        demo.processOrder(-1, 250.50);
    }

    public void processOrder(int orderId, double amount) {
        try {
            validateOrder(orderId, amount);
            System.out.println("Order processed successfully for Order ID: " + orderId);
        } catch (IllegalArgumentException e) {
            System.out.println("Order processing failed: " + e.getMessage());
        }
    }

    private void validateOrder(int orderId, double amount) {
        if (orderId <= 0) {
            throw new IllegalArgumentException("Order ID must be positive");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }
}
