package main;

import shape.Shape;
import shape.ShapeCache;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape.getType());

		Shape clonedShape1 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape1.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape: " + clonedShape2.getType());
	}

}
