package main;

import shapes.Shape;
import shapes.ShapeFactory;

public class Main {

	public static void main(String[] args) {		
		testFactoryOutput();
	}

	private static void testFactoryOutput() {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape circle = shapeFactory.get(ShapeFactory.CIRCLE).setBorderColor(1).setFillColor(2);
		Shape rectangle = shapeFactory.get(ShapeFactory.RECTANGLE).setBorderColor(3).setFillColor(4);
		Shape square = shapeFactory.get(ShapeFactory.SQUARE).setBorderColor(5).setFillColor(6);

		circle.draw();
		rectangle.draw();
		square.draw();
	}

}
