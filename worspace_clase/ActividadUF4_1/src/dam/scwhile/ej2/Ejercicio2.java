package dam.scwhile.ej2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica cu�ntos n�meros se van a introducir");
		int cantidad = Integer.parseInt(sc.nextLine());
		
		int cont = 1;
		int num;
		while (cont <= cantidad) {
			System.out.println("Introduce el " + cont + "� n�mero");
			num = Integer.parseInt(sc.nextLine());
			
			if (num % 2 == 0) {
				System.out.println("El n�mero " + num + " es par");
			} else {
				System.out.println("El n�mero " + num + " es impar");
			}
			
			cont++;
		}
		
		sc.close();

	}

}
