package factory;

import colors.Color;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

public class ShapeFactory extends AbstractFactory {
	public static final String SHAPE_CIRCLE = "CIRCLE";
	public static final String SHAPE_SQUARE = "SQUARE";
	public static final String SHAPE_RECTANGLE = "RECTANGLE";	

	@Override
	public Color getColor(String Color) {
		return null;
	}

	@Override
	public Shape getShape(String Shape) {
		if(Shape.equalsIgnoreCase(SHAPE_CIRCLE)) {
			return new Circle();
		} else if(Shape.equalsIgnoreCase(SHAPE_RECTANGLE)) {
			return new Rectangle();
		} else if(Shape.equalsIgnoreCase(SHAPE_SQUARE)) {
			return new Square();
		}
		
		return null;
	}

}
