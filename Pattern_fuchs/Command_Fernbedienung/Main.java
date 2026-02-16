package Command_Fernbedienung;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("command 1");
        //Einfache Fernbedienung ist unser Aufrufer (invoker)
        EinfacheFernbedienung fb = new EinfacheFernbedienung();

        Licht licht = new Licht(); //unser Empfänger
        LichtAnKommando lkAn = new LichtAnKommando(licht);
        LichtAusKommando lkAus = new LichtAusKommando(licht);

        Fernseher tv = new Fernseher();
        TvAnKommando tvAn = new TvAnKommando(tv);
        TvAusKommando tvAus = new TvAusKommando(tv);



        //weisen ein Kommando dem Aufrufer zu
        fb.setKommando(1, lkAn);
        fb.setKommando(2, lkAus);
        fb.setKommando(3, tvAn);
        fb.setKommando(4, tvAus);

        //viel später: Knopf drücken:
        fb.knopfGedrueckt();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s= scanner.next();
            if(s.equals("q")) {
                break;
            } try {
                Integer key = Integer.parseInt(s);
                fb.knopfGedrueckt();
            }  catch (NumberFormatException e) {
                System.out.printf("Keine gültige Taste");
            }

        }
    }
}