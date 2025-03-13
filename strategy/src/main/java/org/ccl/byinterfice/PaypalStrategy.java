package org.ccl.byinterfice;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}