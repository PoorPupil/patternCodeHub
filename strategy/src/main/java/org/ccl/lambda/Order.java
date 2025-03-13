package org.ccl.lambda;

public class Order {
    private double totalAmount;
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    public double getDiscountedAmount() {
        return discountStrategy.applyDiscount(totalAmount);
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}