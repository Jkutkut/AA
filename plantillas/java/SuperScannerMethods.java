import java.util.Scanner;

/**
 * 
 * @author "Jkutkut -- Jorge Re"
 *
 */
public class SuperScannerMethods {
	private static Scanner sc;
	
	// GETTERS
	/**
	 * Selector of a element from a array.
	 * @param question Question to ask
	 * @param arr Array to use
	 * @return Element selected.
	 */
	public static Object getObjectIn(String question, Object[] arr) {
		String q = question;
		for (int i = 0; i < arr.length; i++) {
			q += arr[i] + "\n";
		}
		return arr[getIntInRange(q, 1, arr.length) - 1];
	}
	
	/**
	 * @param question - Question to show using System.out
	 * @param minLen - min length of String
	 * @param maxLen - max length of String
	 * @return Response given by the scanner meeting the criteria.
	 */
	public static String getString(String question, int minLen, int maxLen) {
		String str;
		while (true) {
			System.out.print(question);
			str = sc.nextLine();
			
			if (str.length() < minLen) {
				System.out.println("La longitud mínima es de " + minLen + " caracteres\n");
			}
			else if (str.length() > maxLen) {
				System.out.println("La longitud máxima es de " + maxLen + " caracteres.\n");
			}
			else {
				return str;
			}
		}
	}
	
	public static String getString(String question) {
		System.out.print(question);
		return sc.nextLine();
	}

	/**
	 * @param question - Question to show using System.out.print
	 * @return Integer given by Scanner
	 */
	public static int getInt(String question) {
		while (true) {
			try {
				System.out.print(question);
				return Integer.parseInt(sc.nextLine());
			}
			catch (NumberFormatException e) {
				System.out.println("El valor no es un número entero válido.\n");
			}
		}
	}
	
	/**
	 * @param question - Question to show using System.out
	 * @return Integer greater or equal to 0
	 */
	public static int getNatural(String question) {
		int n = 0;
		boolean isNotNatural = true;
		while (isNotNatural) {
			n = getInt(question);
			
			if (n >= 0) {
				isNotNatural = false;
			}
			else {
				System.out.println("El número tiene que ser un natural -> [0, inf)\n");
			}
		}
		return n;
	}
	
	/**
	 * @param question - Question to show using System.out
	 * @param min - min value of the desired int
	 * @param max - max value of the desired int
	 * @return Integer inside the interval [min, max]
	 */
	public static int getIntInRange(String question, int min, int max) {
		if (min > max) {
			int swap = min;
			min = max;
			max = swap;
		}
		
		int n = 0;
		boolean isNotValid = true;
		while (isNotValid) {
			n = getInt(question);
			
			if (n >= min && n <= max) {
				isNotValid = false;
			}
			else {
				System.out.printf(
					"El número tiene que ser un natural en el rango [%d, %d]\n\n",
					min, max
				);
			}
		}
		return n;
	}

	/**
	 * @param question - Question to show using System.out.print
	 * @return boolean given by Scanner
	 */
	public static boolean getBoolean(String question) {
		String r;
		while (true) {
			System.out.print(question);
			r = sc.nextLine();
			if (r.matches("[Yy][Ee][Ss]|[Ss][Iií]"))
				return true;
			else if (r.matches("[Nn][Oo]"))
				return false;
			else
				System.out.println("No entiendo. Sí o no?");
		}
	}

	/**
	 * @param question - Question to show using System.out.print
	 * @return Double given by Scanner
	 */
	public static double getDouble(String question) {
		while (true) {
			try {
				System.out.print(question);
				return Double.parseDouble(sc.nextLine());
			}
			catch (NumberFormatException e) {
				System.out.println("El valor no es un número decimal válido.\n");
			}
		}
	}

	/**
	 * @param question - Question to show using System.out
	 * @return Double greater or equal to 0
	 */
	public static double getNaturalDouble(String question) {
		double n = 0d;
		boolean isNotNatural = true;
		while (isNotNatural) {
			n = getDouble(question);
			if (n >= 0d) {
				isNotNatural = false;
			}
			else {
				System.out.println("El número tiene que ser un natural -> [0, inf)\n");
			}
		}
		return n;
	}

}
