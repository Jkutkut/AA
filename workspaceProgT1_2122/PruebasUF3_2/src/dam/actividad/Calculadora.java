package dam.actividad;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero");
		double num1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce el segundo n�mero");
		double num2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce la operaci�n: \n 1 - suma \n 2 - resta " 
		+ "\n 3 - multiplicaci�n \n 4 - divisi�n");
		int operacion = Integer.parseInt(sc.nextLine());
		
		double resultado = (operacion == 1)? num1 + num2 : 
											(operacion == 2)? num1 - num2 :
															(operacion == 3)? num1 * num2 : 
																				num1 / num2;
		System.out.println("El resultado de la operaci�n es " + resultado);
		
		sc.close();

	}

}
