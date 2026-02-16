package Command.TVSteuerung;

public class KanalRaufKommando implements Kommando {
    private TV TV;

    public KanalRaufKommando(TV TV) {
        this.TV = TV;
    }

    @Override
    public void ausfuehren() {
        TV.kanalAuf();
    }


}
