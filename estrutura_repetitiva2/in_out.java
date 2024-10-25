package estrutura_repetitiva2;

import java.util.Scanner;
public class in_out {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int N = src.nextInt();
		int in = 0;
		int out = 0;
		for(int i = 0; i < N; i++) {
			int x = src.nextInt();
			
			if(x < 10 || x > 20) {
				out+=1;
			} else {
				in+=1;
			}
		}
		
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);
		src.close();
	}
}
