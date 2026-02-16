package SWD_Pruefung_2020.Factory_Nokia;
public abstract class Product {

	public void addSerialNumber()
	{
		System.out.println("Add serial number " + toString());
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.getClass().getName());
	}

    abstract String getSpeed();
}
