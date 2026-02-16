package Adapter_Cat_Dog;

public class RealCat  implements Cat{

    private String name;

    public RealCat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void meow() {
        System.out.println("Cat: Miau!");
    }

    public void walk() {
        System.out.println("Cat walks silently.");
    }
}
