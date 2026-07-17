public class Logger {
    private static Logger logger = new Logger();

    private Logger() {
        System.out.println("Logger object created.");
    }

    public static Logger getInstance() {
        return logger;
    }

    public void logMessage(String message) {
        System.out.println("LOG: " + message);
    }
}
