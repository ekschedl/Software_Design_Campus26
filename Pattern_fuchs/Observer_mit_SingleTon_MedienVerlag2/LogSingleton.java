package Observer_mit_SingleTon_MedienVerlag2;

public class LogSingleton {
    private static LogSingleton instance = null;

    private LogSingleton() {
    }

    public static LogSingleton getInstance() {
        if (instance == null) {
            System.out.println("Singleton: wird erstellt");
            instance = new LogSingleton();
        } else {
            System.out.println("Singleton: retuniere bestehende Insanz.");
        }
        return instance;
    }

    public void log(String text) {
        System.out.println("LogSingleton got this String: \"" + text + "\"");
    }
}
