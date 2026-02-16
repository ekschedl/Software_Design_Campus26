package Command.TVSteuerung;

public class KanalAuswahlKommando implements Kommando {
    private TV TV;
    private int kanalNummer;

    public KanalAuswahlKommando(TV TV, int KanalNummer) {
        this.TV = TV;
        this.kanalNummer = KanalNummer;
    }

    @Override
    public void ausfuehren() {
        if (!TV.istAn())
            TV.istAn();

        TV.setKanalNummer(kanalNummer);
    }
}
