import java.util.Scanner;

public class Buy {
	
	boolean exit = false;
	Scanner menu = new Scanner(System.in);
	
	void Buymenu () {
		
		Product Samsung_galaxy_s9 = new Product(1, "Movil", 1, "Samsung Galaxy S9", 899, 1500);
		Product Samsung_galaxy_note = new Product(1, "Movil", 2, "Samsung Galaxy Note", 999, 1500);
		Product Samsung_tv = new Product(1, "TV", 3, "Samsung Tv Curve", 2999, 500);
		Product Samsung_speaker = new Product(2, "Accesorios TV", 4, "Samsung Speaker", 99, 600 );
	
		while(!exit) {
			
			System.out.println();
			
			System.out.println("1. Samsung Galaxy S9");
			System.out.println("2. Samsung Galaxy Note");
			System.out.println("3. Samsung Tv");
			System.out.println("4. Samsung Speaker");
			
			System.out.println("5. Salir");
			
			System.out.println();        
			System.out.print("Introduzca ID producto compra: ");
			int opcion = menu.nextInt();
			System.out.println();
			
				
			switch(opcion) {
			case 1:
				
				System.out.println("Comprado: " + Samsung_galaxy_s9.productname);
				Samsung_galaxy_s9.productstock++;

				break;
			
			case 2:
				
				System.out.println("Comprado: " + Samsung_galaxy_note.productname);
				Samsung_galaxy_note.productstock++;

				break;
			
			case 3:
				
				System.out.println("Comprado: " + Samsung_tv.productname);
				Samsung_tv.productstock++;

				break;
					
			case 4:
				
				System.out.println("Comprado: " + Samsung_speaker.productname);
				Samsung_speaker.productstock++;

				break;

			case 5:
				System.out.print("Saliendo");
				exit = true;
				break;
					
			default:
				System.out.print("Opcion no valida");
				break;
						
			}        
		} 
	
	
	
	
	
	
	
	
	
	}
}