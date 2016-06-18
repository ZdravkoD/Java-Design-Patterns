package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeFactoryTest {
	
	@Test
	public void testCircle() {
		Shape circle = ShapeFactory.get(ShapeFactory.CIRCLE);
		
		assertNotEquals(null, circle);
	}

	@Test
	public void testRectangle() {
		Shape rectangle = ShapeFactory.get(ShapeFactory.RECTANGLE);
		
		assertNotEquals(null, rectangle);
	}

	@Test
	public void testSquare() {
		Shape square = ShapeFactory.get(ShapeFactory.SQUARE);
		
		assertNotEquals(null, square);
	}
	
	@Test
	public void testNullString() {
		Shape shape = ShapeFactory.get(null);
		
		assertEquals(null, shape);		
	}
	
	@Test
	public void testInvalidString() {
		Shape shape = ShapeFactory.get("My custom shape");
		
		assertEquals(null, shape);		
	}

	
}
