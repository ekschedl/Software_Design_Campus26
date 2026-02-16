package Adapter.DucksAndTurkeys;

public class Mallard implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard quacks");
    }

    @Override
    public void fly() {
        System.out.println("Mallard flies");
    }
}
