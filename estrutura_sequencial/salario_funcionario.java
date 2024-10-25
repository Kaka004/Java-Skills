package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;
public class salario_funcionario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int numFuncionario = src.nextInt();
		int horasTrabalhadas = src.nextInt();
		double valorPorHora = src.nextDouble();
		
		double salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("Número: " + numFuncionario );
		System.out.printf("Salário: U$%.2f%n", salario);
		src.close();
	}
}
