public class Product {
	int id;
	String name;
	float price;
	int stock;
	
	public Product (int p_id, String p_name, float p_price, int p_stock) {
		id = p_id;
		name = p_name;
		price = p_price;
		stock = p_stock;
	}
	
	int getProductid () {
		return this.id;
	}
	
	float getPrice() {
		return this.price;
	}
	
	void comparePrice (int price) {
	}
	
	void print() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Stock: " + stock);
	}

}
