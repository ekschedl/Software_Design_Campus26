package Decorator.Rollenspiel;

public class Krieger extends Charakter{
    public Krieger() {
        beschreibung = "Krieger";
    }

    @Override
    public int getStaerke() {
        return 15;
    }

    @Override
    public int getAnzahlDekorator() {
        return 0;
    }
}
