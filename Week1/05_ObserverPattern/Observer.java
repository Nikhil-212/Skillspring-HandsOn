public interface Observer {
    // Called by the subject when there is a new update.
    void update(String productName, boolean available);
}
