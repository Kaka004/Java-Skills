package estrutura_sequencial2;

import java.util.Scanner;

public class posto_combustivel {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int resp = src.nextInt();

		while (resp != 4) {
			if (resp == 1) {
				alcool += 1;
			} else if (resp == 2) {
				gasolina += 1;
			} else if (resp == 3) {
				diesel += 1;
			}

			resp = src.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		src.close();
	}
}
