package Command.Fernbedienung;

// Main-Klasse, um die Fernbedienung zu testen
public class Main {

    //*****************************
    // INVOKER = einfachereFernbedienung  Aufrufer
    //       braucht eine ausführungsmethode= knopfGedrückt()
    // COMMAND = LichtAnKommando  Befehl
    //       definiert das Kommando= ausführen()
    // RECEIVER = Licht  Empfänger
    //       das Objekt das die Aktion durchführt = an()
    // CLIENT = Main
    //       stellt alles zusammen= fernbedienung.knopfgedrueckt()
    public static void main(String[] args) {
        // Erstellen der Fernbedienung
        EinfachereFernbedienung fb = new EinfachereFernbedienung();

        // Erstellen des Empfängers (Licht)
        Licht licht = new Licht();

        // Erstellen des Kommandos und Zuweisen des Empfängers
        LichtAnKommando lichtAnKommando = new LichtAnKommando(licht);

        // Zuweisen des Kommandos zur Fernbedienung
        fb.setKommando(lichtAnKommando);

        // Simulieren des Knopfdrucks
        fb.knopfGedrueckt(); // Ausgabe: "Licht ist an"
    }
}
