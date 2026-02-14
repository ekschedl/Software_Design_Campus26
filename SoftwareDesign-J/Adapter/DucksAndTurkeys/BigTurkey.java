package Adapter.DucksAndTurkeys;

public class BigTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println(" Big Turkey gobbles");
    }

    @Override
    public void fly() {
        System.out.println(" Big Turkey only walks, not fly");
    }
}
