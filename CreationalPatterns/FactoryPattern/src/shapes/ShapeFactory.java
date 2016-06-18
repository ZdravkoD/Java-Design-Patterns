package shapes;

public class ShapeFactory {
	
	public static final String CIRCLE = "CIRCLE";
	public static final String RECTANGLE = "RECTANGLE";
	public static final String SQUARE = "SQUARE";
	
	public static Shape get(String shape) {
		if(shape == null) {
			return null;
		}
		
		if(shape.equals(CIRCLE)) {
			return new Circle();
		} else if(shape.equals(RECTANGLE)) {
			return new Rectangle();
		} else if(shape.equals(SQUARE)) {
			return new Square();			
		}
		
		return null;
	}

}
