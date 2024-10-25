package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class calculo_triangulos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double A = src.nextDouble();
		double B = src.nextDouble();
		double C = src.nextDouble();
		
		double PI = 3.14159;
		double tri, circ, trap, quad, retan;
		
		tri = A * C / 2;
		circ = PI * Math.pow(C, 2);
		trap = (A + B) * C / 2;
		quad = Math.pow(B, 2);
		retan = A * B;
		
		System.out.printf("Triângulo: %.3f%n", tri);
		System.out.printf("Círculo: %.3f%n", circ);
		System.out.printf("Trapézio: %.3f%n", trap);
		System.out.printf("Quadrado: %.3f%n", quad);
		System.out.printf("Retângulo: %.3f%n", retan);
		
		src.close();
	}
}
