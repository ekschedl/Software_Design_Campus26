package Decorator.Cafe;

public class Sirup extends ZutatDecorator{
    public Sirup(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {

        return getraenk.getBeschreibung()+", Sirup" ;
    }

    @Override
    public double kostet() {
        System.out.println("Sirup kostet: 0.8E");
        return getraenk.kostet()+0.80d;
    }
}
