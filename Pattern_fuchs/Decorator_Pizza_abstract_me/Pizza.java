package Decorator_Pizza_abstract_me;


public abstract class Pizza {
    protected String beschreibung = "unbekannte Pizza";

    public String getBeschreibung(){
        return beschreibung;
    }


    public abstract double getPreis();

}