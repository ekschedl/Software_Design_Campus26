package Factory.Pizza;

public abstract class Pizza {

    protected String name;

    public  void prepare(){
        System.out.println("Vorbereiten der Pizza: "+name);
    };

    public  void bake(){
        System.out.println("Backen der Pizza: "+name);
    };

    public  void cut(){
        System.out.println("Schneiden der Pizza: "+name);
    };

    public  void box(){
        System.out.println("Verpacken der Pizza: "+name);
    };

    @Override
    public String toString() {
        return "***************** Pizza: " + name +" *********************";
    }

    public String getName() {
        return name;
    }

}
