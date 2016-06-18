package main;

import shapes.Shape;
import shapes.ShapeFactory;

public class Main {

	public static void main(String[] args) {		
		testFactoryOutput();
	}

	private static void testFactoryOutput() {
		Shape circle = ShapeFactory.get(ShapeFactory.CIRCLE);
		Shape rectangle = ShapeFactory.get(ShapeFactory.RECTANGLE);
		Shape square = ShapeFactory.get(ShapeFactory.SQUARE);

		circle.draw();
		rectangle.draw();
		square.draw();
	}

}
