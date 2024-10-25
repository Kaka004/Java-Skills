package estrutura_repetitiva2;

import java.util.Locale;
import java.util.Scanner;
public class divisao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int num = src.nextInt();
		
		for(int i = 0; i < num; i++) {
			int a, b;
			a = src.nextInt();
			b = src.nextInt();
			if(b == 0) {
				System.out.println("Divisão Impossível");
			} else {
				double div = (double) a / b;
				
				System.out.printf("%.1f%n", div);
			}
		}
		
		src.close();
	}
}
