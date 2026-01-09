package menu;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int op;

		do {
			System.out.println("\n1.Mostrar saludo");
			System.out.println("2.Mostrar datos del grupo");
			System.out.println("3.Mostrar despedida");
			System.out.println("0.Salir");

			op = Leer.datoInt();
			switch (op) {
			case 1:
					System.out.println("Hola Luismi, me quiero rapar la cabeza.");
					
					break;

			case 2:
					System.out.println("Mario Pérez y Raúl Ramírez.");
					
					break;
			case 3:
					System.out.println("Adiós Luismi, ya me he rapado la cabeza.");
					
					break;
			case 0:
					System.out.println("\nGracias por usar este programa.\n");
					
					break;
			default:
					System.out.println("Opción no válida.");
					
					break;

			}
			
		} while (op != 0);

	}

}
