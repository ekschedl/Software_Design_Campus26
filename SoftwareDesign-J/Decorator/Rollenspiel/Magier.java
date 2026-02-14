package Decorator.Rollenspiel;

public class Magier extends Charakter{
    public Magier() {
        beschreibung = "Magier";
    }

    @Override
    public int getStaerke() {
        return 10;
    }

    @Override
    public int getAnzahlDekorator() {
        return 0;
    }
}
