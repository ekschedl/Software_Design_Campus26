package Adapter_Cat_Dog;

public class Main {
    public static void main(String[] args) {

        Cat realCatcat= new RealCat("Sonja");
        Dog realDog= new RealDog("Buffi");

        realDog.run();
        realDog.bark();

        realCatcat.meow();
        realCatcat.walk();


        Dog realCatcatAsDog=new CatAdapter(realCatcat);
        realCatcatAsDog.run(); // ruft walk()
        realCatcatAsDog.bark();// ruft meow()

    }
}
