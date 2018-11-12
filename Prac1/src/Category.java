public class Category {
	int id;
	String name;
	
	public Category (int c_id, String c_name) {
		this.id = c_id;
		this.name = c_name;
	}
	
	int getCategoryid() { return id; }
 	
	String getCategoryname() { return name; }

	 
	int getId() {
		return this.id;
	}
	
	String getName() {
		return this.name;
	}
	

}
