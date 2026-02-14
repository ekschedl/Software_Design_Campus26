package Adapter.DucksAndTurkeys;

public class TurkeyAdapterMitSingelton implements Duck {
    //hier wird die Klasse instanziert die den Adapter bekommt!
    private Turkey turkey;
    private static TurkeyAdapterMitSingelton instance;

    private TurkeyAdapterMitSingelton(Turkey turkey) {
        this.turkey = turkey;
    }

    public static TurkeyAdapterMitSingelton getInstance(Turkey turkey) {
        if (instance == null) {
            instance = new TurkeyAdapterMitSingelton(turkey);
        }
        return instance;
    }

    //hier werden die methoden der klasse gleichgeschrieben!
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
        turkey.gobble();
    }
}
