package Command.Fernbedienung;
//*************COMMAND*****************
// Kommando, um das Licht einzuschalten
public class LichtAnKommando implements Kommando {
    private Licht licht;

    public LichtAnKommando(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausfuehren() {
        licht.an();
    }
}
