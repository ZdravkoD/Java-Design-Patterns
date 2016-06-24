package factory;

import colors.Color;
import shapes.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String Color);
	public abstract Shape getShape(String Shape);
}
