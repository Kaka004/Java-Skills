package estrutura_repetitiva;

import java.util.Scanner;
public class while_ {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int x = src.nextInt();
		
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			x = src.nextInt();		
		}
		
		System.out.println(soma);
		
		src.close();
	}
}
