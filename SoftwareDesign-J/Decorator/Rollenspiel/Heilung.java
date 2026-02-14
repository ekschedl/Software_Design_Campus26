package Decorator.Rollenspiel;

public class Heilung extends CharakterDekorator{
    public Heilung(Charakter charakter) {
        super(charakter);
    }

    @Override
    public String getBeschreibung() {
        return charakter.getBeschreibung()+" ,Heilung";
    }

    @Override
    public int getStaerke() {
        return charakter.getStaerke()+3;
    }
    @Override
    public int getAnzahlDekorator() {
        return charakter.getAnzahlDekorator()+1;
    }
}
