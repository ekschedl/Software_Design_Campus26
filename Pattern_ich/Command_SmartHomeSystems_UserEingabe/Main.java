package Command_SmartHomeSystems_UserEingabe;

public class Main {

    public static void main(String[] args) {

        Licht licht = new Licht();
        Musik musik = new Musik();

        // Commands
        LichtAnCommand lichtAn = new LichtAnCommand(licht);
        LichtAusCommand lichtAus = new LichtAusCommand(licht);
        MusikPlayCommand musikPlay = new MusikPlayCommand(musik);
        MusikStopCommand musikStop = new MusikStopCommand(musik);

        // Invoker_ Konsole
        Steuerkonsole_invoker konsole =
                new Steuerkonsole_invoker(lichtAn);

        konsole.buttonPressed();

        konsole.setCommand(musikPlay);
        konsole.buttonPressed();

        konsole.setCommand(lichtAus);
        konsole.buttonPressed();

        konsole.setCommand(musikStop);
        konsole.buttonPressed();
    }
}

/*
package Command_SmartHomeSystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Licht licht = new Licht();
        Musik musik = new Musik();

        // Commands
        LichtAnCommand lichtAn = new LichtAnCommand(licht);
        LichtAusCommand lichtAus = new LichtAusCommand(licht);
        MusikPlayCommand musikPlay = new MusikPlayCommand(musik);
        MusikStopCommand musikStop = new MusikStopCommand(musik);

        Steuerkonsole_invoker konsole =
                new Steuerkonsole_invoker(lichtAn);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n--- Smart Home Menü ---");
            System.out.println("1 - Licht AN");
            System.out.println("2 - Licht AUS");
            System.out.println("3 - Musik PLAY");
            System.out.println("4 - Musik STOP");
            System.out.println("0 - Beenden");
            System.out.print("Ihre Auswahl: ");

            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    konsole.setCommand(lichtAn);
                    konsole.buttonPressed();
                    break;
                case 2:
                    konsole.setCommand(lichtAus);
                    konsole.buttonPressed();
                    break;
                case 3:
                    konsole.setCommand(musikPlay);
                    konsole.buttonPressed();
                    break;
                case 4:
                    konsole.setCommand(musikStop);
                    konsole.buttonPressed();
                    break;
                case 0:
                    running = false;
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
            }
        }

        scanner.close();
    }
}
 */