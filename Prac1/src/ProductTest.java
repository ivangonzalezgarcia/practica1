import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

 class ProductTest {
	
	@Test
	public void Test() {
		Product p1 = new Product(1, "Category Test", 2, "Product Test", 799, 8);
		assertEquals(p1.getProductid(), 2);
		assertEquals(p1.getProductname(), "Product Test");
		assertEquals(p1.getProductprice(), 799);
		assertEquals(p1.getProductstock(), 8);
 	}
 }