package Command.Musiksteuerung;

public class MusikAusschaltenKommando implements Kommando{
    private MusikSystem musikSystem;

    public MusikAusschaltenKommando(MusikSystem musikSystem) {
        this.musikSystem = musikSystem;
    }

    @Override
    public void ausfuehren() {
        musikSystem.ausschalten();
    }
}
