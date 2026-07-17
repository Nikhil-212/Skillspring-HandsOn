public class Customer implements Observer {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void update(String productName, boolean available) {
        if (available) {
            System.out.println(customerName + ": " + productName + " is now available.");
        }
    }
}
