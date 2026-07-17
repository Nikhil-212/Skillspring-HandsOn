public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("Rahul Kumar"));
        cart.checkout(1200);

        cart.setPaymentStrategy(new UpiPayment("rahul@upi"));
        cart.checkout(750);
    }
}
