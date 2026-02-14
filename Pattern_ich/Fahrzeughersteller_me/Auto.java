package Fahrzeughersteller_me;

public abstract  class Auto {
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
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                '}';
    }
}
