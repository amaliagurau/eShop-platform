package inventory;

import observer.ProductObserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Singleton: Ensures that there is only one instance of InventoryManager throughout the application, providing a global point of access to the central inventory.
public class InventoryManager {
    private static InventoryManager instance;
    private List<Product> inventory;
    private List<ProductObserver> observers;

    private InventoryManager() {
        inventory = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void addObserver(ProductObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ProductObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Product product) {
        for (ProductObserver observer : observers) {
            observer.update(product);
        }
    }

    public void addProduct(Product product) {
        inventory.add(product);
        notifyObservers(product);
    }

    public List<Product> getInventory() {
        return Collections.unmodifiableList(inventory);
    }
}
