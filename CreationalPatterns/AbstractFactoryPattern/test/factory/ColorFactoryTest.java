package factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorFactoryTest {

	@Test
	public void testValidColors() {
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryProducer.FACTORY_COLOR);
		
		assertNotNull(colorFactory.getColor(ColorFactory.COLOR_RED));
		assertNotNull(colorFactory.getColor(ColorFactory.COLOR_GREEN));
		assertNotNull(colorFactory.getColor(ColorFactory.COLOR_BLUE));
	}

	@Test
	public void testInvalidColors() {
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryProducer.FACTORY_COLOR);
		
		assertNull(colorFactory.getColor("Custom color"));
	}
	
}
