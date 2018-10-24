import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		boolean exit = false;
		@SuppressWarnings("resource")
		Scanner menu = new Scanner(System.in);
		
		while(!exit) {
			
			System.out.println();
			System.out.println();
			
			System.out.println("1. Cambio divisa");
			System.out.println("2. Comprobacion stock");
			System.out.println("3. Comprar producto");
			System.out.println("4. Devolver producto");     
			System.out.println("5. Salir");
			System.out.println();        
			System.out.print("Escriba una de las opciones: ");
			int opcion = menu.nextInt();
			System.out.println();
				
			switch(opcion) {

			case 1:
				System.out.print("Introducir ID Producto para cambiar la divisa: ");
				opcion = menu.nextInt();
				

				break;
							
			case 2:
				
				System.out.println();

				Stock.Stockmenu();
				
				break;
				
			case 3:
				
				System.out.println();

				Buy.Buymenu();

				break;
				
			case 4:
				System.out.println();

				Giveback.Givebackmenu();

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
