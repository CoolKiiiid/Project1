/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Cool
 */
class Order {
    int customerId;
    int orderId;
    Product[] products;
    double totalPrice;

    public Order(int customerId,int orderId , Product[] products, double totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }

    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (Product product : products) {
           System.out.println("- " + product.getName() +": " + product.getPrice() + "$");
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}