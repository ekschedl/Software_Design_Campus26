package Command_Fernbedienung;

public class EinfacheFernbedienung {
    private Kommando slot = null;
    public int nrTaste = 0;
    public void setKommando(int nrTaste,Kommando command) {

        slot = command;
        this.nrTaste = nrTaste;
    }

    public void knopfGedrueckt() {
        slot.ausfuehren();
    }
}
