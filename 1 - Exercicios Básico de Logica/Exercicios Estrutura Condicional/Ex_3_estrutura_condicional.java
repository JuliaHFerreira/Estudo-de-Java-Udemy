package Exercicio_Estrutura_Condicional;
import java.util.Scanner;

public class Ex_3_estrutura_condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(B%A==0 || A%B==0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não São Multiplos");
		}	
		sc.close();
	}

}
