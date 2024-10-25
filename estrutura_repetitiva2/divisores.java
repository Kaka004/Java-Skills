package estrutura_repetitiva2;

import java.util.Scanner;
public class divisores {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int num = src.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		src.close();
	}
}
