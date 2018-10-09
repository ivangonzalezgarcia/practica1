public class Product {
	int id;
	String name;
	int categoryid;
	int stock;
	
	public Product (int p_id, String p_name, int p_categoryid, int p_stock) {
		id = p_id;
		name = p_name;
		categoryid = p_categoryid;
		stock = p_stock;
	}
	int getProductid () {
		return this.id;
	}
}
