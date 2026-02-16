package Command.TVSteuerung;


public class KanalAusschaltenKommando implements Kommando {
    private TV tv;

    public KanalAusschaltenKommando(TV tv) {
        this.tv = tv;
    }

    @Override
    public void ausfuehren() {
        tv.ferseherAus();
    }


}
