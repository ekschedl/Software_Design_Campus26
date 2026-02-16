package Factory_Fahrzeughersteller;

public class Auto {
    private String name;

    public Auto(String name){
        this.name = name;
    }

    public void hupe(){
        System.out.println("Hupentest " + name);
    }

    public void wasche(){
        System.out.println("Waschen " + name);
    }

    @Override
    public String toString(){
        return name;
    }
}
