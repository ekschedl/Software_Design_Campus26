package Decorator.Pizza;

public abstract class Pizza {

    protected String beschreibung;


    public String getBeschreibung() {
        return beschreibung;
    }

    public abstract double kostet();
}
