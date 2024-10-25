package estrutura_repetitiva2;

import java.util.Scanner;
public class AoCubo {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int num = src.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			int pri = i;
			int seg = i * i;
			int terc = i * i * i;
			
			System.out.printf("%d %d %d%n", pri, seg, terc);
		}
		
		src.close();
	}
}
