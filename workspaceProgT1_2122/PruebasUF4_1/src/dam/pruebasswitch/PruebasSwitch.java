package dam.pruebasswitch;

import java.util.Scanner;

public class PruebasSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** �A qu� curso? **");
		System.out.println("Indica la edad del ni�o");
		int edad = Integer.parseInt(sc.nextLine());
		
		switch (edad) {
		case 6:
			System.out.println("Su curso es 1� de PRIMARIA");
			break;
		case 7:
			System.out.println("Su curso es 2� de PRIMARIA");
			break;
		case 8:
			System.out.println("Su curso es 3� de PRIMARIA");
			break;
		case 9:
			System.out.println("Su curso es 4� de PRIMARIA");
			break;
		case 10:
			System.out.println("Su curso es 5� de PRIMARIA");
			break;
		case 11:
			System.out.println("Su curso es 6� de PRIMARIA");
			break;
		default:
			System.out.println("No va a PRIMARIA");
			break;
		}
		
		sc.close();

	}

}
