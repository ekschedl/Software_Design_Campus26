package Decorator.Rollenspiel;

public class Schild extends CharakterDekorator{
    public Schild(Charakter charakter) {
        super(charakter);
    }

    @Override
    public String getBeschreibung() {
        return charakter.getBeschreibung()+" ,Schild";

    }

    @Override
    public int getStaerke() {
        return charakter.getStaerke()+4;
    }
    @Override
    public int getAnzahlDekorator() {
        return charakter.getAnzahlDekorator()+1;
    }
}
