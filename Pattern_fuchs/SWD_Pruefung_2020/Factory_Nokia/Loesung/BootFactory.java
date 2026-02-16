package SWD_Pruefung_2020.Factory_Nokia.Loesung;

public class BootFactory extends NokiaFactory {

	@Override
	Product produce(ProductType type) {
		switch(type)
		{
		case BOOTS:
			return new Boots();
		default:
			return null;
		}
	
	}

}
