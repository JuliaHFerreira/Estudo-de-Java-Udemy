package Exercico_Estrutura_Sequencial;
import java.util.Scanner;
public class Ex_1_estrutura_sequencial {

	public static void main(String[] args) {
		int num1,num2,soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número");
		num1 = sc.nextInt( );
		System.out.println("Insira o segundo número");
		num2 = sc.nextInt( );
		soma = num1 + num2;
		
		System.out.printf("A soma de %d + %d = %d", num1,num2,soma);
		
		sc.close();
	}

}
