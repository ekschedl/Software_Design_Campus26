package Singleton_logging;

public class Main {
/*
🧠 Was ist bei allen gleich?
	•	private static instance
	•	private Konstruktor
	•	public static getInstance()
	•	nur eine Instanz im ganzen Programm
 */
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Programm gestartet");
        logger2.log("Benutzer angemeldet");

        // Beweis: gleiche Instanz
        System.out.println(logger1 == logger2); // true

        Logger.getInstance().log("Programm gestartet");

        Config config = Config.getInstance();
        System.out.println("DB URL: " + config.getDatabaseUrl());

        DatabaseConnection.getInstance().connect();

        GameServer server1 = GameServer.getInstance();
        GameServer server2 = GameServer.getInstance();

        server1.start();

        // Beweis: nur eine Instanz
        System.out.println(server1 == server2); // true
    }
    // ===============================
    // 4️⃣ GAME SERVER SINGLETON
    // ===============================
    static class GameServer {
        private static GameServer instance;

        private GameServer() { }

        public static GameServer getInstance() {
            if (instance == null) {
                instance = new GameServer();
            }
            return instance;
        }

        public void start() {
            System.out.println("Game Server gestartet");
        }
    }

    // ===============================
    // 3️⃣ DATABASE CONNECTION SINGLETON
    // ===============================
    static class DatabaseConnection {

        private static DatabaseConnection instance;

        private DatabaseConnection() { }

        public static DatabaseConnection getInstance() {
            if (instance == null) {
                instance = new DatabaseConnection();
            }
            return instance;
        }

        public void connect() {
            System.out.println("Connected to database");
        }
    }

    // ===============================
    // 2️⃣ CONFIG SINGLETON
    // ===============================
    static class Config {

        private static Config instance;

        private String databaseUrl;

        private Config() {
            databaseUrl = "localhost:3306";
        }

        public static Config getInstance() {
            if (instance == null) {
                instance = new Config();
            }
            return instance;
        }

        public String getDatabaseUrl() {
            return databaseUrl;
        }
    }

}
