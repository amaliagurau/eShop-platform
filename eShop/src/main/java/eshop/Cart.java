package eshop;

import inventory.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return new ArrayList<>(items);
    }

    public void clear() {
        items.clear();
    }
}
