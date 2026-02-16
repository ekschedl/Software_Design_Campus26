package Adapter_Duck_Turkey;

public class Stockente implements Duck{
    @Override
    public void quack() {
        System.out.println("Stockente sagt QUACK");
    }

    @Override
    public void fly() {
        System.out.println("Stockente fliegt");

    }
}
