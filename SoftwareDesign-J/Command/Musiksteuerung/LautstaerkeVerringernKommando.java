package Command.Musiksteuerung;

public class LautstaerkeVerringernKommando implements Kommando{
    private MusikSystem musikSystem;

    public LautstaerkeVerringernKommando(MusikSystem musikSystem) {
        this.musikSystem = musikSystem;
    }

    @Override
    public void ausfuehren() {
        musikSystem.lautstaerkeVerringern();
    }
}
