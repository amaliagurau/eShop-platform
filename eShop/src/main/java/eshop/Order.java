package eshop;

import inventory.Product;
import strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private List<Product> items;
    private Date orderDate;
    private PaymentStrategy paymentStrategy;
    private String deliveryMethod;

    public Order(List<Product> items, PaymentStrategy paymentStrategy, String deliveryMethod) {
        this.items = items;
        this.orderDate = new Date();
        this.paymentStrategy = paymentStrategy;
        this.deliveryMethod = deliveryMethod;
    }

    // Getters as needed

    public List<Product> getItems() {
        return new ArrayList<>(items);
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }
}
