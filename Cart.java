/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Cool
 */
class Cart {
    private int customerId;
    private int nProducts;
    private Product[] products;

    public Cart(int customerId , int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = nProducts;
        this.products = new Product[nProducts]; 
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void addProduct(Product product) {
       for( int i = 0; i< nProducts; i++){
        if (products[i] == null) {
            products[i] = product;
            return;
        } 
       }
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < nProducts; i++) {
            if (products[i].getProductId() == product.getProductId()) {
                for (int j = i; j < nProducts - 1; j++) {
                    products[j] = products[j + 1];
                }
                nProducts--;
                break;
            }
        }
    }
    public double calculatePrice() {
        double totalPrice = 0;
        for (int i = 0; i < nProducts; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }

    public void placeOrder() {
        Order order1 = new Order(customerId, 9 ,products, calculatePrice());
        order1.printOrderInfo();
    }
}
