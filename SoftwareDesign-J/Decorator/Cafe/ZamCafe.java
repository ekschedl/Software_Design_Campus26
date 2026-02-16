package Decorator.Cafe;

public class ZamCafe {
    public static void main(String[] args) {
        System.out.println("ZamCafe ist geöffnet");

        Getraenk g1= new Espresso();
        System.out.println(g1.getBeschreibung());
        //Staktrace:
        g1 =new Milch(g1);
        g1 =new Milch(g1);
        g1 =new Sirup(g1);
        // wie könnte man zugreifen auf milch 2
        //g1=g1.g1.getBeschreibung();

        System.out.println("Beschreibung: "+ g1.getBeschreibung());
        System.out.println(g1.getBeschreibung()+" kostet: "+g1.kostet());

    }
}
