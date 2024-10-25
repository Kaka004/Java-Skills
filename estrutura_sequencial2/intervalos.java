package estrutura_sequencial2;

import java.util.Locale;
import java.util.Scanner;

public class intervalos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double num = src.nextDouble();
		
		if(num < 0 || num > 100) {
			System.out.println("Fora de intervalo");
		} else if(num <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if(num <= 50) {
			System.out.println("Intervalo [25,50]");
		} else {
			System.out.println("Intervalo [75,100]");
		}
		
		src.close();
	}
}
