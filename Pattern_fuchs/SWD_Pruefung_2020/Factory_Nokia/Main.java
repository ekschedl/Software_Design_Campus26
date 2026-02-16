package SWD_Pruefung_2020.Factory_Nokia;
public class Main {
    // bitte selbst implementieren
    public static void main(String[] args) {
        NokiaFactory baseStationFactory = new BaseStationFactory();
        NokiaFactory bootFactory = new BootFactory();

        Product boots=baseStationFactory.getProduct(ProductType.BOOTS);
        Product station3= baseStationFactory.getProduct(ProductType.STATION3G);
        Product station4=baseStationFactory.getProduct(ProductType.STATION4G);
        Product station5=baseStationFactory.getProduct(ProductType.STATION5G);

        if(boots !=null){
            System.out.println("Boots: " + boots.getSpeed());
        }
        if(station3!=null){
            System.out.println("Station: " + station3.getSpeed());
        }
        if(station4!=null){
            System.out.println("Station: " + station4.getSpeed());
        }
        if(station5!=null){
            System.out.println("Station: " + station5.getSpeed());
        }

    }
}
