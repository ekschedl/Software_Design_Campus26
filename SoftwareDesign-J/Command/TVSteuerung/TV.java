package Command.TVSteuerung;

public class TV {
    private boolean an=false;
    private int kanalNummer =1;

    public void kanalAuf() {
        if (!an) {
            an = true;
            System.out.println("fernseher wird eingeschaltet");
        }
        if (kanalNummer == 40) {
            kanalNummer = 1;
        } else {
            kanalNummer++;
            System.out.println("TV +1: " + kanalNummer);
        }

    }

    public void kanalAb() {
        if (!an) {
            System.out.println("bitte schalte den Fernseher an!");
        } else {
            if (kanalNummer == 1) {
                kanalNummer = 40;
            } else {
                kanalNummer--;
                System.out.println("TV -1: " + kanalNummer);
            }
        }
    }

    public void ferseherAus() {
        System.out.println("Fernseher wird ausgeschaltet");
        an = false;
    }

    public boolean istAn() {
        return an;
    }

    public void setAn(boolean an) {
        this.an = an;
    }

    public int getKanalNummer() {
        return kanalNummer;
    }

    public void setKanalNummer(int kanalNummer) {
        System.out.println("Neuer Kanal wird gesetzt: " + kanalNummer);
        this.kanalNummer = kanalNummer;
        System.out.println("neuer TV "+this.kanalNummer);
    }
}
