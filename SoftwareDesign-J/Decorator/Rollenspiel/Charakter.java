package Decorator.Rollenspiel;

public abstract class Charakter {

    protected String beschreibung;

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }


    public abstract int getStaerke();
    public abstract int getAnzahlDekorator();
}
