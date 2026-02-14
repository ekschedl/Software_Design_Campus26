package Adapter.DucksAndTurkeys;

public class DuckAdapterOhneSingelton implements Turkey {
    private Duck duck;

    public DuckAdapterOhneSingelton(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
        duck.fly();

    }
}
