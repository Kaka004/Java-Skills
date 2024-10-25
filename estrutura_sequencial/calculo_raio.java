package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class calculo_raio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = src.nextDouble();
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", area);
		
		src.close();
	}

}
