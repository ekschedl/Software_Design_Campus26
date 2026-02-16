package Adapter_Duck_Turkey;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();;
    }

    @Override
    public void fly() {
        turkey.walk();
        turkey.walk();
    }
}
