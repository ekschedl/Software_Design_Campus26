package Observer.FitnessTracker;

public class Fortschritt {
    public Enum<Aktivitaet> aktivitaet;
    public double dauer;
    public String datum;

    public Fortschritt(Enum<Aktivitaet> aktivitaet, double dauer, String datum) {
        this.aktivitaet = aktivitaet;
        this.dauer = dauer;
        this.datum = datum;
    }

    public Enum<Aktivitaet> getAktivitaet() {
        return aktivitaet;
    }

    public void setAktivitaet(Enum<Aktivitaet> aktivitaet) {
        this.aktivitaet = aktivitaet;
    }

    public double getDauer() {
        return dauer;
    }

    public void setDauer(double dauer) {
        this.dauer = dauer;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
}
