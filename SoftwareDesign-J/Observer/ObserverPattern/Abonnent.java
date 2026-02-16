package Observer.ObserverPattern;

public interface Abonnent {

    //wenn der Medienverlag leinen neuen Artikel heraus bringt wird erhalte() aufgerufen

    public void erhalte(Artikel artikel);

    public String getName();

}
