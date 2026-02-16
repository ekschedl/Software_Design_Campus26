package Observer.FitnessTracker;

public class Main {
    public static void main(String[] args) {
        FitnessTracker ft = new FitnessTracker();

        Fortschritt fortschritt1= new Fortschritt(Aktivitaet.AEROBIC,12.4,"12.04.2025");
        Fortschritt fortschritt2= new Fortschritt(Aktivitaet.LAUFEN,100.4,"13.04.2025");
        Fortschritt fortschritt3= new Fortschritt(Aktivitaet.RADFAHREN,230,"15.04.2025");

        Geraete tablet = new Tablet("Tablet",ft);
        Geraete smartWatch = new SmartWatch("SmartWatch",ft);
        Geraete smartPhone = new SmartPhone("SmartPhone",ft);

        ft.veroeffentliche(fortschritt1);
        ft.veroeffentliche(fortschritt2);
        ft.veroeffentliche(fortschritt3);
    }
}
