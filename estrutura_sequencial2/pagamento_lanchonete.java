package estrutura_sequencial2;

import java.util.Locale;
import java.util.Scanner;

public class pagamento_lanchonete {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int cod = src.nextInt();
		int qtd = src.nextInt();
		
		double total = 0.0;
		if(cod == 1) {
			total = qtd * 4.00;
		} else if(cod == 2) {
			total = qtd * 4.50;
		} else if(cod == 3) {
			total = qtd * 5.00;
		} else if(cod == 4) {
			total = qtd * 2.00;
		} else if(cod == 5) {
			total = qtd * 1.50;
		} else {
			System.out.println("Código inválido!");
		}
		
		System.out.printf("Total: %.2f%n", total);
		
		src.close();
	}
}
