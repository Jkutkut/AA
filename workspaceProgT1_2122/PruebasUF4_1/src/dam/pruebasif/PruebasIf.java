package dam.pruebasif;

import java.util.Scanner;

public class PruebasIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero entero");
		int num = Integer.parseInt(sc.nextLine());
		
		// OPCION SIMPLE
		if (num % 7 == 0) {
			System.out.println("El n�mero es m�ltiplo de 7");
		}
		
		// OPCION SI Y SI NO
		if (num % 2 == 0) {
			System.out.println("El n�mero es PAR");
		} else {
			System.out.println("El n�mero es IMPAR");
		}
		
		// OPCION ANALIZAMOS M�S DE UNA POSIBILIDAD
		if (num % 6 == 0) {
			System.out.println("El n�mero es m�ltiplo de 6");
		} else if (num % 3 == 0) {
			System.out.println("El n�mero es m�ltiplo de 3");
		} else {
			System.out.println("El n�mero no es ni m�ltiplo de 6 ni de 3");
		}
		
		System.out.println("Fin del programa");
			
		sc.close();

	}

}
