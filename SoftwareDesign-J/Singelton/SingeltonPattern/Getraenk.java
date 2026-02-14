package Singelton.SingeltonPattern;

public abstract class Getraenk {

    protected String beschreibung="unbekanntes Getraenk";

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public  abstract double kostet();
}
