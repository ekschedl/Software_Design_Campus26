package Command_Fernbedienung;
public class TvAusKommando implements Kommando {
    private final Fernseher fernseher;


    public TvAusKommando(Fernseher fernseher) {

        this.fernseher = fernseher;
    }

    @Override
    public void ausfuehren() {
        fernseher.aus();
    }
}
