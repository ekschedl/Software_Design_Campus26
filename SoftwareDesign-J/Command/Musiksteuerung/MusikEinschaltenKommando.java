package Command.Musiksteuerung;

public class MusikEinschaltenKommando implements Kommando{
    private MusikSystem musikSystem;

    public MusikEinschaltenKommando(MusikSystem musikSystem) {
        this.musikSystem = musikSystem;
    }

    @Override
    public void ausfuehren() {
        musikSystem.einschalten();
    }
}
