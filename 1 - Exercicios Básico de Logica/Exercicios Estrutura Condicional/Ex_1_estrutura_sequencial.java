package Exercicio_Estrutura_Condicional;
import java.util.Scanner;

public class Ex_1_estrutura_sequencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		if (num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();

	}

}
