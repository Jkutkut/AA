package dam.ej4;

import java.util.Scanner;

public class Ejerccicio4 {
	
	static final String PWD = "password";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String pwd;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Introduce la contrase�a (intento " + i + ")");
			pwd = sc.nextLine();
			
			if (PWD.equals(pwd)) {
				System.out.println("Enhorabuena, la contrase�a es correcta");
				i = 3;
			} else if (i < 3) {
				System.out.println("La contrase�a es incorrecta, int�ntalo de nuevo");
			} else {
				System.out.println("La contrase�a es incorrecta. Se agotaron los intentos");
			}
			
		}	
		
		sc.close();

	}

}
