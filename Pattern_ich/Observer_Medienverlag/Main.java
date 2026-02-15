package Observer_Medienverlag;

public class Main {
   public static void main(String[] args) {
        Medienverlag m = new Medienverlag();
        PrintAbonnent pa = new PrintAbonnent("PA_Abonnent",m );
        SMSAbonnent sa= new SMSAbonnent("SA_Abonnent",m);
        WebAbonnent wa=new WebAbonnent("WA_Abonnent",m);

        Artikel artikel01=new Artikel("Heute nacht", "Heute Nacht stellen wir die Sommerzeit um");
        Artikel artikel02=new Artikel("Heute in der früh", "Heute in der früh wird es warm");

m.veroeffentlichen(artikel01);
m.veroeffentlichen(artikel02);
   }
}
