package factory;

import colors.Blue;
import colors.Color;
import colors.Green;
import colors.Red;
import shapes.Shape;

public class ColorFactory extends AbstractFactory {
	public static final String COLOR_GREEN = "GREEN";
	public static final String COLOR_BLUE = "BLUE";
	public static final String COLOR_RED = "RED";	

	@Override
	public Color getColor(String Color) {
		if(Color.equalsIgnoreCase(COLOR_GREEN)) {
			return new Green();
		} else if(Color.equalsIgnoreCase(COLOR_BLUE)) {
			return new Blue();
		} else if(Color.equalsIgnoreCase(COLOR_RED)) {
			return new Red();
		} 
		
		return null;
	}

	@Override
	public Shape getShape(String Shape) {
		return null;
	}

}
