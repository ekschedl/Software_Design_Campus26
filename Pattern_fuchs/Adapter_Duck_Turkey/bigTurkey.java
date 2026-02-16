package Adapter_Duck_Turkey;

public class bigTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Big Turkey GOBBLES");
    }

    @Override
    public void walk() {
        System.out.println("Big Turkey WALKS");
    }
}
