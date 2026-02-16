package Factory.AutoFabrik;

public class FabrikEngland extends AutoFabrik{

    @Override
    protected AutoTyp fabricateCar(String orderType) {

        if(orderType.equalsIgnoreCase("Pkw")){
            System.out.println("Fabrik England produziert keine PKWs");
            return  null;
        } else if (orderType.equalsIgnoreCase("Lkw")) {
            return  new LKW();
        } else if (orderType.equalsIgnoreCase("Suv")) {
            System.out.println("Fabrik England produziert keine SUVs");
            return  null;
        }
        return null;
    }
}
