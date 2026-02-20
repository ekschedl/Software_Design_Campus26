package Observer_mit_SingleTon_MedienVerlag2_1i1a;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Medienverlag!");
        Medienverlag klatsch = new Medienverlag();
        Artikel artikel1 = new Artikel("Titel 1: Babyhund", "Text1: Kleiner Welpe ist süß");
        Artikel artikel2 = new Artikel("Titel 2: Rettung", "Text2: Das Rote Kreuz ist super");
        //Abonnenten
        Abonnent Peter = new PrintAbonnent("Peter", klatsch);
        Abonnent Hans = new SMSAbonnent("Hans", klatsch);
        Abonnent Wilhelm = new SMSAbonnent("Wilhelm", klatsch);
        Abonnent Meixi = new WebAbonnent("Meixi", klatsch);
        //veröffentliche Artikel:
        klatsch.veroeffentliche(artikel1);
        klatsch.veroeffentliche(artikel2);
        //Output: jeder Abonnent soll anzeigen dass er den Artikel erhalten hat
        //z.B: "--Hans hat folgenden Artikel erhalten: "Titel 1: Babyhund"

        //Singleton
        LogSingleton l = LogSingleton.getInstance();
        l.log("Testlog mit Singleton");
        l = LogSingleton.getInstance();
        l.log("text2");
    }
}