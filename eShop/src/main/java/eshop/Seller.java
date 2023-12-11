package eshop;

import inventory.Product;
import inventory.Promotion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Seller {
    private String name;
    private List<Product> products = new ArrayList<>();
    private List<Promotion> promotions = new ArrayList<>();

    public Seller(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void configurePromotion(Product product, double discountPercent, Date startTime, Date endTime) {
        Promotion promotion = new Promotion(product, discountPercent, startTime, endTime);
        promotions.add(promotion);
    }

    public void updateProduct(Product product, String name, String category, int stock, double price) {
        product.setName(name);
        product.setCategory(category);
        product.setStock(stock);
        product.setPrice(price);
    }
}
