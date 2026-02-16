package Command_Fernbedienung;
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
