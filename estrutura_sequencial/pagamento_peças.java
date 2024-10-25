package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class pagamento_peças {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int cod1, cod2, numPec1, numPec2;
		double valorUni1, valorUni2, total;
		
		cod1 = src.nextInt();
		numPec1 = src.nextInt();
		valorUni1 = src.nextDouble();
		src.nextLine();
		cod2 = src.nextInt();
		numPec2 = src.nextInt();
		valorUni2 = src.nextDouble();
		
		total = (numPec1 * valorUni1) + (numPec2 * valorUni2);
		
		System.out.printf("Valor a pagar: %.2f%n", total);
		
		src.close();
	}
}
