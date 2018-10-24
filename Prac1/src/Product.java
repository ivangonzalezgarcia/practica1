import java.util.Scanner;

public class Product extends Category {

	int productid;
	String productname;
	float productprice;
	int productstock;
	
	boolean exit = false;
	int inputId;
	double priceinUSD;
	double priceinGBP;
	double EURtoGBP = 0.88;
	double EURtoUSD = 1.15;
	
	Scanner menu = new Scanner(System.in);
	
	
	public Product(int c_id, String c_name, int productid, String productname, float productprice, int productstock) {
		
		super(c_id, c_name);
		
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productstock = productstock;
		
	}

	
	/*Product Samsung_galaxy_s9 = new Product(1, "Movil", 1, "Samsung Galaxy S9", 899, 1500);
	Product Samsung_galaxy_note = new Product(1, "Movil", 2, "Samsung Galaxy Note", 999, 1500);
	Product Samsung_tv = new Product(1, "TV", 3, "Samsung Tv Curve", 2999, 500);
	Product Samsung_speaker = new Product(2, "Accesorios TV", 4, "Samsung Speaker", 99, 600 );
	
	
	double PricetoUSD() {
		
		System.out.print("Introduzca ID producto para cambiar a USD:  ");
		inputId = menu.nextInt();

		
		if (inputId == 1) {
			priceinUSD = Samsung_galaxy_s9.productprice * EURtoUSD;
			System.out.println("Precio en USD: " + priceinUSD);
		}
		
		if (inputId == 2) {
			priceinUSD = Samsung_galaxy_note.productprice * EURtoUSD;
			System.out.println("Precio en USD: " + priceinUSD);
		}
		
		if (inputId == 3) {
			priceinUSD = Samsung_tv.productprice * EURtoUSD;
			System.out.println("Precio en USD: " + priceinUSD);
		}
		
		if (inputId == 4) {
			priceinUSD = Samsung_speaker.productprice * EURtoUSD;
			System.out.println("Precio en USD: " + priceinUSD);
		}		
		
		return priceinUSD;
	}
	
	
	double PricetoGBP() {
		
		System.out.print("Introduzca ID producto para cambiar a GBP:  ");
		inputId = menu.nextInt();

		
		if (inputId == 1) {
			priceinGBP = (float) (Samsung_galaxy_s9.productprice * EURtoGBP);
			System.out.println("Precio en GBP: " + priceinGBP);
		}
		
		if (inputId == 2) {
			priceinGBP = (float) (Samsung_galaxy_note.productprice * EURtoGBP);
			System.out.println("Precio en GBP: " + priceinGBP);
		}
		
		if (inputId == 3) {
			priceinGBP = (float) (Samsung_tv.productprice * EURtoGBP);
			System.out.println("Precio en GBP: " + priceinGBP);
		}
		
		if (inputId == 4) {
			priceinGBP = (float) (Samsung_speaker.productprice * EURtoGBP);
			System.out.println("Precio en GBP: " + priceinGBP);
		}	
		
		
		return priceinGBP;
	}
	*/
	
	void comparePrice (int Product_Price) {
				
		
	}
	
	
}