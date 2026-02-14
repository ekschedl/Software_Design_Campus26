package Observer.ObserverPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Krone Klatsch startet....");
        Medienverlag klatsch = new Medienverlag();


        Artikel artikel1=new Artikel("Baby Hund rettet Kind","Kleiner Welpe überrascht uns alle mit seinem Mut als er..");
        Artikel artikel2=new Artikel("Autos sind gut für die Umwelt", "Neue Studie bezahlt von der AutofahrerPartei findet, dass Autos doch super sind....");

        Abonnent walter=new PrintAbonnent("Walter", klatsch);
        Abonnent gertrud=new PrintAbonnent("Gertrude", klatsch);
        Abonnent anneliese=new WebAbonnent("Anneliese", klatsch);
        Abonnent theodora=new SMSAbonnent("Theodora", klatsch);


        System.out.println("-----Artikel 1 veröffentlichen-------");

        klatsch.veroeffentliche(artikel1);


        System.out.println("-----Artikel 2 veröffentlichen-------");

        klatsch.veroeffentliche(artikel2);
    }
}
