package SWD_Pruefung_2020.Factory_Nokia.Loesung;

public abstract class Product {
	public abstract String getSpeed();

	public void addSerialNumber()
	{
		System.out.println("Add serial number " + toString());
	}
	
	@Override
	public String toString() {
		return String.format("%s: Speed:%s", this.getClass().getName(), getSpeed());
	}

}
