package Exercicios_Estrutura_While;
import java.util.Scanner;

public class Ex_1_estrutura_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while(senha!=2002) {
			
			System.out.printf("%nSenha Invalida%n");
			senha = sc.nextInt();
		}
		
		System.out.printf("%nAcesso Permitido!");
		sc.close();
	}

}
