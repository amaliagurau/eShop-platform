package observer;

import inventory.Product;

//Observer: Allows the Client to subscribe to product updates through the ProductObserver interface. When a new product is added to the inventory (InventoryManager), all subscribed clients are notified.
public interface ProductObserver {
    void update(Product product);
}
