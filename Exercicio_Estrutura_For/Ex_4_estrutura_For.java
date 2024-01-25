package Exercicio_Estrutura_For;

import java.util.Scanner;

public class Ex_4_estrutura_For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n ; i++) {
			double num = sc.nextInt();
			double deno = sc.nextInt();
			if(deno==0) {
				System.out.printf("%nDivisão Impossivel%n");
			}
			else {
				double div = num/deno;
				System.out.printf("%n%.1f%n", div);
			}
		}
		sc.close();
	}

}
