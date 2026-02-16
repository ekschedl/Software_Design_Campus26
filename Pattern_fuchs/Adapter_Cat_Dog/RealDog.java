package Adapter_Cat_Dog;

public class RealDog implements Dog{
    private String name;

    public RealDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {}
    @Override
    public void bark() {
        System.out.println("Dog: Wuff!");
    }

    @Override
    public void run() {
        System.out.println("Dog runs fast!");
    }
}
