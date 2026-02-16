package Observer.ObserverPatternPotcast;

import java.util.ArrayList;
import java.util.List;

public class PodcastServer {

    private List<PotcastPlayer> abonnentenList = new ArrayList<>();
    private List<Potcast> potcastList = new ArrayList<>();

    public void addSubscriber(PotcastPlayer thisPotcastPlayer) {
        abonnentenList.add(thisPotcastPlayer);
        System.out.println("Potcast: +Subscriber: " + thisPotcastPlayer.getName() + " hinzugefügt");
    }

    public void addPotcast(Potcast thisPotcast) {
        potcastList.add(thisPotcast);
        for (PotcastPlayer thisPotcastPlayer : abonnentenList) {
            System.out.println(thisPotcastPlayer.getName()+" can now listen to the new potcast: "+thisPotcast.getName());
        }
    }

    public void removeSubscriber(PotcastPlayer thisPotcastPlayer) {

        abonnentenList.remove(thisPotcastPlayer);
    }

    public void veroeffentliche(Potcast potcast) {
        addPotcast(potcast);
        for (PotcastPlayer thisPotcastPlayer : abonnentenList) {
            thisPotcastPlayer.erhalte(potcast);
        }
    }
}
