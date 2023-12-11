package inventory;

import java.util.Date;

public class Promotion {
    private Product product;
    private double discountPercent;
    private Date startTime;
    private Date endTime;

    public Promotion(Product product, double discountPercent, Date startTime, Date endTime) {
        this.product = product;
        this.discountPercent = discountPercent;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and setters
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
