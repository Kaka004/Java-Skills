package DEBUG;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner src = new Scanner(System.in);
		 
		 double largura = src.nextDouble();
		 double comprimento = src.nextDouble();
		 double metroQuadrado = src.nextDouble();
		 
		 double area = largura * comprimento;
		 double preco = area * metroQuadrado;
		 
		 System.out.printf("AREA = %.2f%n", area);
		 System.out.printf("PRECO = %.2f%n", preco);
		 
		 src.close();
	}
}
