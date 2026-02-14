package Adapter.DucksAndTurkeys;

public class Main {
    public static void main(String[] args) {
        System.out.println("*************");
        Duck d1 = new Mallard();
        d1.quack();
        BigTurkey t1 = new BigTurkey();
        t1.gobble();


        Duck ta = TurkeyAdapterMitSingelton.getInstance(t1);
        ta.fly();
        ta.quack();

        Turkey te = new DuckAdapterOhneSingelton(d1);
        te.fly();
        te.gobble();

        Duck falscheEnte2= TurkeyAdapterMitSingelton.getInstance(t1);

    }
}
