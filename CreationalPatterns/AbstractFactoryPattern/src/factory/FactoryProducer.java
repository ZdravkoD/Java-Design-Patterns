package factory;

public class FactoryProducer {
	
	public static final String FACTORY_COLOR = "FACTORY_COLOR";
	public static final String FACTORY_SHAPE = "FACTORY_SHAPE";
	
	public static AbstractFactory getFactory(String factory) {
		
		if(factory.equalsIgnoreCase(FACTORY_COLOR)) {
			return new ColorFactory();
		} else if(factory.equalsIgnoreCase(FACTORY_SHAPE)) {
			return new ShapeFactory();
		}
		
		return null;
	}

}
