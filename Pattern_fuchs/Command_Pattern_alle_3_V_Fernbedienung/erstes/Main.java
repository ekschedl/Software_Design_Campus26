package Command_Pattern_alle_3_V_Fernbedienung.erstes;

public class Main {
    // das ist unser klient im Pattern
    public static void main(String[] args) {
        // Fernbedienung ist unser Aufrufer (invoker)
        EinfacheFernbedienung fb = new EinfacheFernbedienung();

        Licht licht = new Licht(); // wird ab nächster Zeile unser Empfänger sein
        LichtAnKommando lk = new LichtAnKommando(licht);

        //weisen ein Kommando dem Aufrufer zu
        fb.setKommando(lk);

        // irgendwann viel später (bzw. ganz woander sim code)
        // simulieren knopf drücken
        fb.knopfGedrueckt();

    }
}
