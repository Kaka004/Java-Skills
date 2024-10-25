package estrutura_repetitiva;

import java.util.Scanner;

public class for_ {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("Digite o número para repetição:");
		int num = src.nextInt();
		
		int soma = 0;
		for(int i = 0; i < num ; i++) {
			int x = src.nextInt();
			soma += x;
		}
		System.out.println("Valores: " + soma);
		src.close();
	}
}
