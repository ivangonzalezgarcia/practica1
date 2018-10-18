public class Category {
	int id;
	String name;
	
	public Category (int c_id, String c_name, int c_parentid) {
		id = c_id;
		name = c_name;
	}
	 
	int getId() {
		return this.id;
	}
	
	String getName() {
		return this.name;
	} 
}
