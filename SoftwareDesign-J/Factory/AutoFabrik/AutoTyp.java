package Factory.AutoFabrik;

public abstract class AutoTyp {
    protected Enum<AutoType> name;

    public void fabricate(){
        System.out.println("Auto herstellen ");
    }
    public void hupen(){
        System.out.println(name+" hupt");
    }
    public void waschen(){
        System.out.println(name+" wird gewaschen");
    }

    public Enum<AutoType> getName() {
        return name;
    }
}
