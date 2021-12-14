package dam.ej3.main;

import java.util.Scanner;

import dam.ej3.pojo.Empleado;

public class RevisionSalarios {

	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Indica la cantidad de empleados");
		int cantidad = Integer.parseInt(sc.nextLine());
		
		Empleado emple;
		for (int i = 1; i <= cantidad; i++) {
			// solicitar los datos del empleado i
			emple = solicitarDatosEmple(i);
			
			emple.revisarSalario();
			
			System.out.println(emple);
			
		}
		
		sc.close();

	}

	private static Empleado solicitarDatosEmple(int i) {
		System.out.println("Introduce el n�mero del " + i + "� empleado");
		int numEmple = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el salario mensual");
		double salMes = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce los a�os de antig�edad");
		int aniosAnt = Integer.parseInt(sc.nextLine());
		
		return new Empleado(numEmple, salMes, aniosAnt);
	}

}
