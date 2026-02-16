package Observer.MediaVerlag;

import java.util.ArrayList;
import java.util.List;

public class MedienVerlag {
    private List<AbonnentIn> abonnentenList = new ArrayList<>();



    public void addObserver(AbonnentIn abonnentIn) {
        abonnentenList.add(abonnentIn);
    }
    public void removeObserver(AbonnentIn abonnentIn) {
        abonnentenList.remove(abonnentIn);
    }
    public void notifyObservers(Article article) {
        for (AbonnentIn abonnentIn : abonnentenList) {
            abonnentIn.update(article);
        }
    }
}
