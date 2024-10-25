package estrutura_sequencial2;

import java.util.Scanner;

public class positivo_negativo {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int num = src.nextInt();
		
		if(num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}
		
		src.close();
	}
}
