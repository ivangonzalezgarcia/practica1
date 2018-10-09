import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class configTest {

	@Test
	void test() {
		Product p1 = new Product (123, "Prueba", 456, 5);
		assertEquals(p1.getProductid(),  123);
	}
}
