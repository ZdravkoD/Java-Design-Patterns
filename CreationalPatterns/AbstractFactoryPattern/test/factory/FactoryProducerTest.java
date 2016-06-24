package factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryProducerTest {

	@Test
	public void testColorFactory() {
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryProducer.FACTORY_COLOR);
		assertNotNull(colorFactory);
	}

	@Test
	public void testShapeFactory() {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.FACTORY_SHAPE);
		assertNotNull(shapeFactory);
	}
	
	@Test
	public void testInvalidFactory() {
		AbstractFactory invalidFactory = FactoryProducer.getFactory("Invalid name");
		assertNull(invalidFactory);
	}
	
}
