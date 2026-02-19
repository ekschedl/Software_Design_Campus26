package Command_Fernbedienung_Eingabescanner;
public class LichtAusKommando implements Kommando {
    private final Licht licht;

    public LichtAusKommando(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausfuehren() {
        licht.aus();
    }
}
