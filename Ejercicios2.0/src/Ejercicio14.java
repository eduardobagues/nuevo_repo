import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
	
		
			Scanner teclado = new Scanner(System.in);
			
			int N,un,de,ce,dosDigit;
			System.out.println("Mete un numero para invertir");
			N = teclado.nextInt();
			
			
			ce = N/100;
		
			dosDigit = N - ce*100;
			
			de = dosDigit/10;
			
			un = dosDigit - de*10;
			
			System.out.println("Invertido--> "+un+de+ce);
	}

}
