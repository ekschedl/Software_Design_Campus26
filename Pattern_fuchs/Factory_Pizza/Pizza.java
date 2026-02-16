package Factory_Pizza;
public class Pizza {
    protected String name;

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("-Vorbereiten der Pizza.");
    }

    public void bake() {
        System.out.println("-Backen der Pizza.");
    }

    public void cut() {
        System.out.println("-Schneiden der Pizza.");
    }

    public void box() {
        System.out.println("-Einschachteln der Pizza.");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }

}
