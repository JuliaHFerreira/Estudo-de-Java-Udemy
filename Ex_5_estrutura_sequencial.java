package Exercico_Estrutura_Sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Ex_5_estrutura_sequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, numPecas1, cod2, numPecas2;
		double vlrUnPeca1, vlrUnPeca2, total;
		
		System.out.println("Enter the code for the first part: ");
		cod1 = sc.nextInt();
		
		System.out.println("Enter the quantity of pieces: ");
		numPecas1 = sc.nextInt();
		
		System.out.println("Enter the value of the part: ");
		vlrUnPeca1 = sc.nextDouble();
		
		System.out.println("Enter the code of the second part: ");
		cod2 = sc.nextInt();
		
		System.out.println("Enter the quantity of pieces: ");
		numPecas2 = sc.nextInt();
		
		System.out.println("Enter the value of the part: ");
		vlrUnPeca2 = sc.nextDouble();
		
		total = (vlrUnPeca1*numPecas1)+(vlrUnPeca2*numPecas2);
		
		System.out.printf("AMOUNT TO PAY US$ %.2f", total);
		
		sc.close();
	}

}
