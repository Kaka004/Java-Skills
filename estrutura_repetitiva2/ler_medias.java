package estrutura_repetitiva2;

import java.util.Locale;
import java.util.Scanner;
public class ler_medias {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int num = src.nextInt();
		
		for(int i = 0; i < num; i++) {
			double nota1 = src.nextDouble();
			double nota2 = src.nextDouble();
			double nota3 = src.nextDouble();
			
			double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10;
			
			System.out.printf("%.1f%n", media);
		}
		
		src.close();
	}
}
