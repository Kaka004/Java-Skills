package estrutura_sequencial;

import java.util.Scanner;

public class ler_diferenca {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int a = src.nextInt();
		int b = src.nextInt();
		int c = src.nextInt();
		int d = src.nextInt();
		
		int diferenca = (a * b - c * d);
		
		System.out.println("Diferença: " + diferenca);
		
		src.close();
	}

}
