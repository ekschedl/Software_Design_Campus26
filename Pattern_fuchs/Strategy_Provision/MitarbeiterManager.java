package Strategy_Provision;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterManager {
    private List<Mitarbeiterin> mList = new ArrayList<>();
    private ProvisionsStrategie provisionsStrategie;

    public void addMitarbeiterin(Mitarbeiterin m) {
        mList.add(m);
    }

    public MitarbeiterManager(ProvisionsStrategie p) {
        this.provisionsStrategie = p;
    }

    public void setProvisionsStrategie(ProvisionsStrategie provisionsStrategie) {
        this.provisionsStrategie = provisionsStrategie;
    }

    public void berechneProvision() {
        if (provisionsStrategie == null) {
            return;
        }
        for(Mitarbeiterin m : mList){
            System.out.print(m.getName() + " :");
            System.out.println(provisionsStrategie.berechneProvision(m));
        }
    }
}
