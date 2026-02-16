package SWD_Pruefung_2020.Factory_Nokia;
public class BaseStationFactory extends NokiaFactory {


    @Override
    protected Product createProduct(ProductType type) {
        if(type==ProductType.STATION3G){
            return new BaseStation3G();
        } else if(type==ProductType.STATION5G){
            return new BaseStation5G();
        } else if(type==ProductType.STATION4G){
            return new BaseStation4G();
        } else
            return null;
    }

}
