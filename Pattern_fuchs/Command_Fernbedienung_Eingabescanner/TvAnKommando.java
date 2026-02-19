package Command_Fernbedienung_Eingabescanner;
public class TvAnKommando implements Kommando {
    private final Fernseher fernseher;


    public TvAnKommando(Fernseher fernseher) {

        this.fernseher = fernseher;
    }

    @Override
    public void ausfuehren() {
        fernseher.an();
    }
}
