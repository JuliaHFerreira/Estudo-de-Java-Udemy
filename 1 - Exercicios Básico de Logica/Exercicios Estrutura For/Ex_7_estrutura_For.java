package Exercicio_Estrutura_For;
import java.util.Scanner;

public class Ex_7_estrutura_For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c2,c3;
		
		for (int i = 1; i<=n ; i++) {
			
			c2 = i*i;
			c3 = i*i*i;
			System.out.printf("%d %d %d%n", i, c2, c3);
		}
		sc.close();
	}

}
