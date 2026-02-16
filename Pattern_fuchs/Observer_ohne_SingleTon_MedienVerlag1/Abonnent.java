package Observer_ohne_SingleTon_MedienVerlag1;

public interface Abonnent {
    public void erhalte(Artikel artikel);

    public String getName();
}
