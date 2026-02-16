package SWD_Pruefung_2020.Factory_Nokia.Loesung;

public class BaseStationFactory extends NokiaFactory {

	@Override
	Product produce(ProductType type) {
		switch(type)
		{
		case STATION3G:
			return new BaseStation3G();
		case STATION4G:
			return new BaseStation4G();
		case STATION5G:
			return new BaseStation5G();
		default:
			return null;
		}
	}

}
