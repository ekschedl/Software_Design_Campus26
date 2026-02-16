package Ich.Factory_Pizza_me;

public class Pizza {
    protected String name;

    public String getName() {
        return name;
    }
    public void prepare() {
        System.out.println("-Vorbereiten.");
    }

    public void bake() {
        System.out.println("-Backen.");
    }

    public void cut() {
        System.out.println("-Schneiden.");
    }

    public void box() {
        System.out.println("-Einschachteln.");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
