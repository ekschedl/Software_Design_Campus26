package Command.Musiksteuerung;

public class MusikSystem {
    private boolean istEin = false;
    private int lautstaerke = 1;

    public void einschalten() {
        if(!istEin) {
            istEin = true;
            System.out.println("Musik ist an");
        }else{
            System.out.println("Musik ist schon an");
        }

    }

    public void ausschalten() {
        if(istEin) {
            istEin = false;
            System.out.println("Musik ist aus");
        }else{
            System.out.println("Musik ist schon aus");
        }

    }

    public void lautstaerkeErhoehen() {
        if (!istEin) {
            return;
        }
        if (lautstaerke == 10) {

            System.out.println("Es geht nicht lauter");
        }else{
            lautstaerke++;
            System.out.println("neue Lautstaerke "+ lautstaerke);
        }
    }

    public void lautstaerkeVerringern() {
        if (!istEin) {
            return;
        }
        if (lautstaerke == 0) {
            System.out.println("Es geht nicht leiser");
        }else{
            lautstaerke--;
            System.out.println("neue Lautstaerke "+ lautstaerke);
        }
    }
}
