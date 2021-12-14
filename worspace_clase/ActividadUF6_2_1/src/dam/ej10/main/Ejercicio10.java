package dam.ej10.main;

import java.util.Scanner;

import dam.ej10.pojo.Articulo;

public class Ejercicio10 {

	static Scanner sc;
	static Articulo[] compra;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicilizarArray();
		
		rellenarArray();
		
		mostrarArticulos();
		
		// calcular total y art�culo m�s caro
		realizarCalculo();
		
		sc.close();

	}

	private static void realizarCalculo() {
		int total = 0;
		int mayorPrecio = -1;
		Articulo artMasCaro = null;
		
		for (int i = 0; i < compra.length; i++) {
			total += compra[i].getPrecio();
			
			if (compra[i].getPrecio() > mayorPrecio) {
				artMasCaro = compra[i];
				mayorPrecio = compra[i].getPrecio();
			}
		}
		
		System.out.println("El total de la compra es " + total + " �");
		System.out.println("El art�culo de la compra m�s caro es \n" + artMasCaro);
		
	}

	private static void mostrarArticulos() {
		System.out.println("\nListado de art�culos:");
		for (int i = 0; i < compra.length; i++) {
			System.out.println(compra[i]);
		}
		
	}

	private static void rellenarArray() {
		String nom;
		int pre;
		for (int i = 0; i < compra.length; i++) {
			System.out.println("Introduce el nombre del " + (i+1) + "� art�culo");
			nom = sc.nextLine();
			
			System.out.println("Introduce el precio del art�culo");
			pre = Integer.parseInt(sc.nextLine());
			
			compra[i] = new Articulo(nom, pre);
		}
		
	}

	private static void inicilizarArray() {
		System.out.println("Cu�ntos art�culos tiene la compra");
		int numArt = Integer.parseInt(sc.nextLine());
		
		compra = new Articulo[numArt];
		
	}

}
