public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop");
        Customer firstCustomer = new Customer("Meera");
        Customer secondCustomer = new Customer("Arjun");

        // Interested customers subscribe before stock is updated.
        laptop.addObserver(firstCustomer);
        laptop.addObserver(secondCustomer);
        laptop.setAvailable(true);
    }
}
