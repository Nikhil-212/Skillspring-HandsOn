import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String productName;
    private boolean available;
    private List<Observer> observers = new ArrayList<Observer>();

    public Product(String productName) {
        this.productName = productName;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setAvailable(boolean available) {
        this.available = available;
        // Notify customers whenever availability changes.
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(productName, available);
        }
    }
}
