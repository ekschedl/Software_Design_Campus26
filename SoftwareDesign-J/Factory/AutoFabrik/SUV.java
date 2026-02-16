package Factory.AutoFabrik;

public class SUV extends AutoTyp{

    public SUV() {
        name= AutoType.SUV;
    }

    // falls Autotyp nicht hupen kann:

    @Override
    public void hupen() {
        System.out.println("Kann nicht hupen");
    }
}
