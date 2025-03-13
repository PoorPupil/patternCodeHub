package lambda;

import org.ccl.lambda.DiscountStrategy;
import org.ccl.lambda.Order;

public class OrderTest {
    public static void main(String[] args) {
        DiscountStrategy noDiscount = amount -> amount;
        DiscountStrategy tenPercentDiscount = amount -> amount * 0.9;

        Order order = new Order();
        order.setTotalAmount(100);
        order.setDiscountStrategy(noDiscount);
        System.out.println(order.getDiscountedAmount()); // 100

        order.setDiscountStrategy(tenPercentDiscount);
        System.out.println(order.getDiscountedAmount()); // 90
    }
}
