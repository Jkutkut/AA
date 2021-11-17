import java.util.Scanner;

public class HastaCasoVacio {
	public static final String CHARARCTER = ".";
	public static final int END = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int current;
		boolean running = true;
		
		while (running) {
			current = Integer.parseInt(sc.next());
			
			if (current == END) {
				running = false;
			}
		}
		
		sc.close();
	}
}
