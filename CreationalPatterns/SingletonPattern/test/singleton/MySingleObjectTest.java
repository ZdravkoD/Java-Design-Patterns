package singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class MySingleObjectTest {

	@Test
	public void testGetInstance() {
		MySingleObject instance = MySingleObject.getInstance();
		assertNotNull(instance);
	}

}
