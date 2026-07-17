public class Main {
    public static void main(String[] args) {
        
        Logger firstLogger = Logger.getInstance();
        Logger secondLogger = Logger.getInstance();

        firstLogger.logMessage("Application started");
        secondLogger.logMessage("User logged in");
        System.out.println("Same object: " + (firstLogger == secondLogger));
    }
}
