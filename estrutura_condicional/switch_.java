package estrutura_condicional;

import java.util.Scanner;

public class switch_ {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		int resp = src.nextInt();
		String dia;

		switch (resp) {
				case 1:
					dia = "Domingo";
					break;
				case 2:
					dia = "Segunda";
					break;
				case 3:
					dia = "Ter�a";
					break;
				case 4:
					dia = "Quarta";
					break;
				case 5:
					dia = "Quinta";
					break;
				case 6:
					dia = "Sexta";
					break;
				case 7:
					dia = "S�bado";
				default:
					dia =  "Valor invalido!";
					break;
		}
		
		System.out.println("Dia da semana: " + dia);

		src.close();
	}
}
