import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
 
 class CategoryTest {
	
	@Test
	public void Test() {
		Category c1 = new Category(1, "Category Test");
		assertEquals(c1.getCategoryid(), 1);
		assertEquals(c1.getCategoryname(), "Category Test");
	}
 }