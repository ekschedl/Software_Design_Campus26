package Command.Fernbedienung;

//**************INVOKER********************
// Vereinfachte Fernbedienung, die ein Kommando speichern und ausführen kann
public class EinfachereFernbedienung {
    private Kommando slot;

    // Konstruktor
    public EinfachereFernbedienung() {}

    // Methode, um ein Kommando zuzuweisen
    public void setKommando(Kommando kommando) {
        this.slot = kommando;
    }

    // Methode, um das zugewiesene Kommando auszuführen
    public void knopfGedrueckt() {
        if (slot != null) {
            slot.ausfuehren();
        } else {
            System.out.println("Kein Kommando zugewiesen!");
        }
    }
}
