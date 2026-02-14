package Factory.AutoFabrik;

public class FabrikDeutschland extends AutoFabrik{

    @Override
    protected AutoTyp fabricateCar(String orderType) {

        if(orderType.equalsIgnoreCase("Pkw")){
            return  new PKW();
        } else if (orderType.equalsIgnoreCase("Lkw")) {
            return  new LKW();
        } else if (orderType.equalsIgnoreCase("Suv")) {
            return new SUV();
        }
        return null;
    }
}
