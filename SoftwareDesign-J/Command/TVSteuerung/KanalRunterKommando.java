package Command.TVSteuerung;

public class KanalRunterKommando implements Kommando {
    private TV TV;

    public KanalRunterKommando(TV TV) {
        this.TV = TV;
    }

    @Override
    public void ausfuehren() {
        TV.kanalAb();
    }


}
