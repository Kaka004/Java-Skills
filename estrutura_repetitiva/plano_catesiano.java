package estrutura_repetitiva;

import java.util.Scanner;

public class plano_catesiano {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int x = src.nextInt();
		int y = src.nextInt();
		
		while (x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if( x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			} else {
				System.out.println(" ");
			}
			x = src.nextInt();
			y = src.nextInt();
		}
		src.close();
	}
}
