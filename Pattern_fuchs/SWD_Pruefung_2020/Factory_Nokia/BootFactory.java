package SWD_Pruefung_2020.Factory_Nokia;



public class BootFactory extends NokiaFactory {


    @Override
    protected Product createProduct(ProductType type) {
        switch(type)
        {
            case BOOTS:
                return new Boots();
            default:
                return null;
        }
    }
}
