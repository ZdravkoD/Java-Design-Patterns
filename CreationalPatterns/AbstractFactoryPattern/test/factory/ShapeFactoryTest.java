package factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeFactoryTest {

	@Test
	public void testValidColors() {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.FACTORY_SHAPE);
		
		assertNotNull(shapeFactory.getShape(ShapeFactory.SHAPE_CIRCLE));
		assertNotNull(shapeFactory.getShape(ShapeFactory.SHAPE_RECTANGLE));
		assertNotNull(shapeFactory.getShape(ShapeFactory.SHAPE_SQUARE));
	}

	@Test
	public void testInvalidColors() {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.FACTORY_SHAPE);
		
		assertNull(shapeFactory.getShape("Custom shape"));
	}

}
