package Command_Fernbedienung_Eingabescanner;
public class LichtAnKommando implements Kommando {
    private final Licht licht;


    public LichtAnKommando(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausfuehren() {
        licht.an();
    }
}
