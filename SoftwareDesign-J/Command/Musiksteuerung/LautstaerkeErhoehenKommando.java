package Command.Musiksteuerung;

public class LautstaerkeErhoehenKommando implements Kommando{
    private MusikSystem musikSystem;

    public LautstaerkeErhoehenKommando(MusikSystem musikSystem) {
        this.musikSystem = musikSystem;
    }

    @Override
    public void ausfuehren() {
        musikSystem.lautstaerkeErhoehen();
    }
}
