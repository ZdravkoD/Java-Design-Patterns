package shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShapeFactoryTest {
	
	ShapeFactory shapeFactory;

	@Before
	public void Before() {
		shapeFactory = new ShapeFactory();
	}
	
	@Test
	public void testCircle() {
		Shape circle = shapeFactory.get(ShapeFactory.CIRCLE);
		
		assertNotEquals(null, circle);
	}

	@Test
	public void testRectangle() {
		Shape rectangle = shapeFactory.get(ShapeFactory.RECTANGLE);
		
		assertNotEquals(null, rectangle);
	}

	@Test
	public void testSquare() {
		Shape square = shapeFactory.get(ShapeFactory.SQUARE);
		
		assertNotEquals(null, square);
	}
	
	@Test
	public void testNullString() {
		Shape shape = shapeFactory.get(null);
		
		assertEquals(null, shape);		
	}
	
	@Test
	public void testInvalidString() {
		Shape shape = shapeFactory.get("My custom shape");
		
		assertEquals(null, shape);		
	}


}
