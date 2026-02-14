package Decorator.Cafe;

public class Milch extends ZutatDecorator{
    public Milch(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung()+", Milch" ;
    }

    @Override
    public double kostet() {
        System.out.println("Milch kostet: 0.50E");
        return getraenk.kostet()+0.50d;
    }
}
