package Decorator.Rollenspiel;

public class SpielSimulator {
    public static void main(String[] args) {

        Charakter magier= new Magier();
        Charakter krieger= new Krieger();

        magier= new Feuerball(magier);
        magier= new Schild(magier);
        
        krieger= new Schwert(krieger);
        krieger= new Heilung(krieger);

        System.out.println("Beschreibung: "+magier.getBeschreibung());
        System.out.println("Gesamtstärke: "+magier.getStaerke());
        System.out.println("Beschreibung: "+krieger.getBeschreibung());
        System.out.println("Gesamtstärke: "+krieger.getStaerke());
    }
}
