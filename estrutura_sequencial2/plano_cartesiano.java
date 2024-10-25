package estrutura_sequencial2;

import java.util.Locale;
import java.util.Scanner;

public class plano_cartesiano {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double x, y;
		
		x = src.nextDouble();
		y = src.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if(x < 0 && y < 0) {
			System.out.println("Q3");
		} else if(x > 0 && y < 0) {
			System.out.println("Q4");
		} else {
			System.out.println("Está na origem");
		}
		
		src.close();
	}
}
