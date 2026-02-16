package SWD_Pruefung_2020.Factory_Nokia;
public abstract class  NokiaFactory {

	// Methodensignatur bitte nicht verändern!!
	public Product getProduct(ProductType type) {

		Product c = null;

		// hier darf programmiert werden


        // Produkterstellung wird ausgelagert
        c = createProduct(type);
        if(c != null){
           c.addSerialNumber();
        }

		// AB HIER NICHT MEHR VERÄNDERN
		// JEDES Produkt muss eine Seriennummer erhalten

		
		return c;
	}

     abstract Product createProduct(ProductType type);
}
