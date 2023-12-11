package observer;

import eshop.Cart;
import eshop.Order;
import inventory.Product;
import strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client implements ProductObserver {
    private String name;
    private List<Product> watchList = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }

    public void addToWatchList(Product product) {
        watchList.add(product);
    }

    public void placeOrder(Cart cart, PaymentStrategy paymentStrategy, String deliveryMethod) {
        Order order = new Order(new ArrayList<>(cart.getItems()), paymentStrategy, deliveryMethod);
        orders.add(order);
        // Update stock after order completion
        for (Product item : cart.getItems()) {
            item.decrementStock();
        }
        cart.clear();
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    @Override
    public void update(Product product) {
        System.out.println("Notification to client " + name + ": Product " + product.getName() + " is now available!");
    }
}
