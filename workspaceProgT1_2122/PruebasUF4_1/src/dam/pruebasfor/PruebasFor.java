package dam.pruebasfor;

import java.util.Scanner;

public class PruebasFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el n�mero de repeticiones");
		int numRep = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= numRep; i++) {
			System.out.println("Repetici�n " + i);
		}
		
		// convertimos el for en un while
		int i = 1;
		while (i <= numRep) {
			System.out.println("Repetici�n " + i);
			i++;
		}
		
		System.out.println("FIN DEL PROGRAMA");
		
		sc.close();

	}

}
