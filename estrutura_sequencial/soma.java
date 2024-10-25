package estrutura_sequencial;

import java.util.Scanner;

public class soma {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int num1 = src.nextInt();
		int num2 = src.nextInt();
		
		int total = num1 + num2;
		
		System.out.println("Soma: "+ total);
		
		src.close();
	}
}
