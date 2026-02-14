package Decorator.Rollenspiel;

public class Schwert extends CharakterDekorator{
    public Schwert(Charakter charakter) {
        super(charakter);
    }

    @Override
    public String getBeschreibung() {
        return charakter.getBeschreibung()+" ,Schwert";
    }

    @Override
    public int getStaerke() {
        return charakter.getStaerke()+7;
    }
    @Override
    public int getAnzahlDekorator() {
        return charakter.getAnzahlDekorator()+1;
    }
}
