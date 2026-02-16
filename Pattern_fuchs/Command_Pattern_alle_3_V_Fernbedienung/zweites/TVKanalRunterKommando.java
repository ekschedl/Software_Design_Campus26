package Command_Pattern_alle_3_V_Fernbedienung.zweites;

public class TVKanalRunterKommando implements Kommando {

    private TV tv;


    public TVKanalRunterKommando(TV tv) {
        this.tv = tv;
    }

    @Override
    public void ausfuehren() {
        if (!tv.istEin()) {
            tv.ein();
        } else {
            tv.runter();
        }
    }



}
