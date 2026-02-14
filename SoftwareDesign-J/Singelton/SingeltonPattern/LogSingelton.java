package Singelton.SingeltonPattern;

public class LogSingelton {

    private static LogSingelton obj;

    private LogSingelton() { }

    public static LogSingelton getInstance() {
        if (obj == null) {
            obj = new LogSingelton();
        }
        return obj;
    }
    public void log(String logText) {
        System.out.println("LogSingleton: LOG: "+logText);
    }
}
