package SWD_Pruefung_2020.Factory_Nokia.Loesung;

public abstract class NokiaFactory {

	abstract Product produce(ProductType type);
	

	public Product getProduct(ProductType type) {

		
		Product c = produce(type);

		if ( c == null)
		{
			return null;
		}
		

		c.addSerialNumber();
		
		return c;
	}
	
	
}
