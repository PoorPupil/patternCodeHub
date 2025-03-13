package byinterfice;

import org.ccl.byinterfice.CreditCardStrategy;
import org.ccl.byinterfice.Item;
import org.ccl.byinterfice.PaypalStrategy;
import org.ccl.byinterfice.ShoppingCart;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("123", 10));
        cart.addItem(new Item("456", 40));

        // 使用 PayPal 支付
        cart.pay(new PaypalStrategy());

        // 使用信用卡支付
        cart.pay(new CreditCardStrategy());
    }
}