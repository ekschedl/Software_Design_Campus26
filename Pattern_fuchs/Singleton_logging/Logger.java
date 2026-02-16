package Singleton_logging;

public class Logger {

    // 1. Eine einzige Instanz
    private static Logger instance;

    // 2. Privater Konstruktor (niemand darf new Logger() machen)
    private Logger() {
    }

    // 3. Zugriffsmethode
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // 4. Log-Methode
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}