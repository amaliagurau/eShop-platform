package eshop;

import inventory.InventoryManager;
import inventory.Product;
import observer.Client;
import strategy.*;

public class EShop {
    public static void main(String[] args) {
        // Example usage of the classes

        // Create products
        Product laptop = new Product("Laptop", "Electronics", 10, 999.99);
        Product phone = new Product("Smartphone", "Electronics", 20, 499.99);

        // Create sellers
        Seller electronicsSeller = new Seller("Electronics Store");

        // Add products to the central inventory
        InventoryManager inventoryManager = InventoryManager.getInstance();
        inventoryManager.addProduct(laptop);
        inventoryManager.addProduct(phone);

        // Add products to the seller's inventory
        electronicsSeller.addProduct(laptop);
        electronicsSeller.addProduct(phone);

        // Create a client
        Client client = new Client("Amalia Gurau");

        // Add a product to the client's watchlist
        client.addToWatchList(laptop);

        // Create a cart
        Cart cart = new Cart();

        // Add a product to the cart
        cart.addItem(laptop);

        // Place an order with different payment methods
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy cashPayment = new CashPayment();
        PaymentStrategy loanPayment = new LoanPayment(12); // Loan payment split into 12 months

        client.placeOrder(cart, creditCardPayment, "Home Delivery");
        client.placeOrder(cart, cashPayment, "In-Store Pickup");
        client.placeOrder(cart, loanPayment, "Pickup Point");

        // Display information about the central inventory
        System.out.println("Central Inventory:");
        for (Product product : inventoryManager.getInventory()) {
            System.out.println("- " + product.getName() + " | Stock: " + product.getStock());
        }

        // Display information about the client's orders
        for (Order order : client.getOrders()) {
            System.out.println("Order Date: " + order.getOrderDate());
            System.out.println("Payment Method: " + order.getPaymentStrategy().getClass().getSimpleName());
            System.out.println("Delivery Method: " + order.getDeliveryMethod());
            System.out.println("Items:");
            for (Product item : order.getItems()) {
                System.out.println("- " + item.getName());
            }
            System.out.println("------");
        }
    }
}
