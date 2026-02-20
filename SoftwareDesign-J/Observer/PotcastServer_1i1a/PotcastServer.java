package Observer.PotcastServer_1i1a;

import java.util.ArrayList;
import java.util.List;

public class PotcastServer {

    private List<PotcastPlayer> potcastPlayerList = new ArrayList<>();

    private List<Potcast> potcastList = new ArrayList<>();

    public void addPotcastPlayer(PotcastPlayer potcastPlayer) {
        potcastPlayerList.add(potcastPlayer);
    }


    public void updatePotcastPlayers(Potcast potcast) {


        for (PotcastPlayer potcastPlayer : potcastPlayerList) {
            potcastPlayer.getPotcast(potcast);
        }

    }


}
