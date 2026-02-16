package Adapter_Duck_Turkey;

public class Main {
    public static void main(String[] args) {
        Duck d1= new Stockente();
        d1.quack();

        bigTurkey t1 = new bigTurkey();

        Duck adaptierteEnte = new TurkeyAdapter(t1);

        adaptierteEnte.quack();
        adaptierteEnte.fly();
    }
}
