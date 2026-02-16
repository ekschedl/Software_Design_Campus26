package Observer_Medienverlag;

import java.util.ArrayList;
import java.util.List;

public class Medienverlag {
    List<Abonnent> abonnen= new ArrayList<Abonnent>();

    public void veroeffentlichen(Artikel artikel){
        for(Abonnent a:abonnen){
            a.erhalteArtikel(artikel);
        }
    }

    public void addSubscriber(Abonnent abonnent){
        abonnen.add(abonnent);
    }
    public void entferneSubscriber(Abonnent abonnent){
        abonnen.remove(abonnent);
    }

}
