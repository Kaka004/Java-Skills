package estrutura_sequencial2;

import java.util.Scanner;

public class hora_jogo {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int horaInicial = src.nextInt();
		int horaFinal = src.nextInt();
		
		int duracao;
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou "+ duracao +" horas");
		
		src.close();
	}
}
