package Factory.AutoFabrik;

public abstract class AutoFabrik {


    public AutoTyp orderCar(String orderType){

        AutoTyp autoTyp = fabricateCar(orderType);
        System.out.println("*** AutoTyp wird erstellt ****");
        if(autoTyp==null){
            return null;
        }else {
            autoTyp.waschen();
            autoTyp.hupen();

            System.out.println("Auto funktioniert");

            return autoTyp;
        }
    }

    protected  abstract AutoTyp fabricateCar(String orderType);
}
