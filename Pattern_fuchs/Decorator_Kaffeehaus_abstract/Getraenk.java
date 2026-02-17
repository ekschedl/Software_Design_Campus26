package Decorator_Kaffeehaus_abstract;

public abstract class Getraenk {
    protected String beschreibung = "unbekanntes Gestraenk";

    public String getBeschreibung(){
        return beschreibung;
    }
    public abstract double kostet();

}
