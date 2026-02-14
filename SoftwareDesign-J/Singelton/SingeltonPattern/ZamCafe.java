package Singelton.SingeltonPattern;

public class ZamCafe {
    public static void main(String[] args) {
        System.out.println("ZamCafe ist geöffnet");

        LogSingelton logObject = LogSingelton.getInstance();

        Getraenk g1 = new Espresso();
        System.out.println(g1.getBeschreibung());
        logObject.log("Erstelle 2x Milch");
        g1 = new Milch(g1);
        g1 = new Milch(g1);
        g1 = new Sirup(g1);

        System.out.println("Beschreibung: " + g1.getBeschreibung());
        System.out.println(g1.getBeschreibung() + " kostet: " + g1.kostet());

        logObject.log("Schließe das ZAM Cafe");
    }
}
