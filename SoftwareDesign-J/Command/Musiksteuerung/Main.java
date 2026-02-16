package Command.Musiksteuerung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusikSystem musikSystem = new MusikSystem();
        MusikFernbedienung musikFernbedienung = new MusikFernbedienung();

        MusikEinschaltenKommando musikEin=new MusikEinschaltenKommando(musikSystem);
        MusikAusschaltenKommando musikAus=new MusikAusschaltenKommando(musikSystem);
        LautstaerkeErhoehenKommando lauter=new LautstaerkeErhoehenKommando(musikSystem);
        LautstaerkeVerringernKommando leiser=new LautstaerkeVerringernKommando(musikSystem);

        musikFernbedienung.setKommandos(1,musikEin);
        musikFernbedienung.setKommandos(4,musikAus);
        musikFernbedienung.setKommandos(2,lauter);
        musikFernbedienung.setKommandos(3,leiser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie 1, 2 oder 3 ein, um die Fernbedienung zu testen (q zum Beenden):");
        System.out.println("1: Einschalten");
        System.out.println("2: Lauter");
        System.out.println("3: Leiser");
        System.out.println("4: Ausschalten");
        while(true) {
            String input = scanner.next();
            if(input.equals("q")) {
                musikFernbedienung.knopfDruecken(4);
                break;
            }

            try {
                int knopf = Integer.parseInt(input);
                musikFernbedienung.knopfDruecken(knopf);
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl oder q ein.");
            }
        }
        scanner.close();
    }
}
