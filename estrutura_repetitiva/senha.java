package estrutura_repetitiva;

import java.util.Scanner;

public class senha {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int senha = src.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inválida! Tente novamente");
			senha = src.nextInt();
		}
		System.out.println("Acesso liberado!");
		src.close();
	}

}
