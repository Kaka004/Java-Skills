package estrutura_repetitiva2;

import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int num = src.nextInt();
		int fatorial = 1;
		
		for(int i = 1; i <= num; i++) {
			fatorial *= i;
		}
		
		System.out.printf("%d", fatorial);
		
		src.close();
	}
}
