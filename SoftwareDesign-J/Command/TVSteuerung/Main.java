package Command.TVSteuerung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fernbedienung fernbedienung = new Fernbedienung();

        TV TV = new TV();


        fernbedienung.setKommando(3, new KanalAuswahlKommando(TV, 23));
        fernbedienung.setKommando(1, new KanalRaufKommando(TV));
        fernbedienung.setKommando(2, new KanalRunterKommando(TV));

        fernbedienung.setKommando(4, new KanalAusschaltenKommando(TV));

        // Benutzerinteraktion
        Scanner scanner = new Scanner(System.in);
        String eingabe;

        System.out.println("Geben Sie 1, 2 oder 3 ein, um die Fernbedienung zu testen (q zum Beenden):");
        while (true) {
            System.out.print("Knopf drücken: ");
            eingabe = scanner.nextLine();
            if (eingabe.equalsIgnoreCase("q")) {
                break;
            }
            try {
                int knopf = Integer.parseInt(eingabe);
                fernbedienung.knopfDruecken(knopf);
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
            }
        }
        scanner.close();
    }
}
