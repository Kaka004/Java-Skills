package estrutura_sequencial2;

import java.util.Scanner;

public class multiplos {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int A = src.nextInt();
		int B = src.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("S�o Multiplos");
		} else {
			System.out.println("N�o s�o Multiplos");
		}
		
		src.close();
	}
}
