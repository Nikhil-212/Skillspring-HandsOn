public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("Both Logger objects are the same instance.");
        } else {
            System.out.println("Different Logger objects are created.");
        }

        System.out.println();

        demonstrateSingleton(logger1, logger2);
    }

    public static void demonstrateSingleton(Logger logger1, Logger logger2) {

        logger1.setUsernameAndPassword("nik", "abc123");
        logger2.setUsernameAndPassword("nikkk", "abc123");

        System.out.println("Logger 1 Credentials");
        logger1.displayCredentials();

        System.out.println("-------------------------");

        System.out.println("Logger 2 Credentials");
        logger2.displayCredentials();

        System.out.println("\nBoth objects share same Logger instance.");
    }
}