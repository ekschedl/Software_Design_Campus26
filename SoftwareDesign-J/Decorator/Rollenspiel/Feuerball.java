package Decorator.Rollenspiel;

public class Feuerball extends CharakterDekorator{
    public Feuerball(Charakter charakter) {
        super(charakter);
    }

    @Override
    public String getBeschreibung() {
        return charakter.getBeschreibung()+" ,Feuerball";
    }

    @Override
    public int getStaerke() {
        return charakter.getStaerke()+5;
    }

    @Override
    public int getAnzahlDekorator() {
        return charakter.getAnzahlDekorator()+1;
    }
}
