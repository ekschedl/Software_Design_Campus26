package Decorator.Rollenspiel;

public abstract class CharakterDekorator extends Charakter {
    protected Charakter charakter;

    public CharakterDekorator(Charakter charakter) {
        this.charakter = charakter;
    }



    public abstract String getBeschreibung();


}
