package Command_Fernbedienung;
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
