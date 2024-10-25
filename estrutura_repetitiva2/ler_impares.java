package estrutura_repetitiva2;

import java.util.Scanner;
public class ler_impares {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int x = src.nextInt();
		
		for(int i = 1; i < x; i += 2) {
			System.out.println(i);
		}
		src.close();
	}
}
