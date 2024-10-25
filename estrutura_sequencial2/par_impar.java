package estrutura_sequencial2;

import java.util.Scanner;

public class par_impar {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int num = src.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		src.close();
	}
}
