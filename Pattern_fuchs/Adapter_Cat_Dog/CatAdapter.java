package Adapter_Cat_Dog;

/*
// CatAdapter macht aus einer Cat einen Dog.
// Adapter implementiert Dog
// Adapter enthält eine Cat
// Adapter übersetzt Methode
 */
public class CatAdapter implements Dog{

    private Cat cat; //has /Komposition
    public CatAdapter(Cat cat) {
        this.cat = cat;
    }
    @Override
    public void bark() {
        // Dog.bark() wird auf Cat.meow() gemappt
        cat.meow();
        // Zusätzliche Logik
        for(int i = 0; i < 3; i++) {
            cat.meow();
        }
    }


    @Override
    public void run() {
        // Dog.run() wird auf Cat.walk() gemappt
        System.out.println("CatAdapter nutzt Dog.run()wird auf Cat.walk() gemappt ");
        cat.walk();
    }
}


/*
Adapter + Singleton kombiniert (beliebt!)

Manchmal will Professor:
“Es darf nur ein Adapter existieren.”

class CatAdapter implements Dog {

    private static CatAdapter instance;
    private Cat cat;

    private CatAdapter(Cat cat) {
        this.cat = cat;
    }

    public static CatAdapter getInstance(Cat cat) {
        if(instance == null) {
            instance = new CatAdapter(cat);
        }
        return instance;
    }

    @Override
    public void bark() {
        cat.meow();
    }
}
 */