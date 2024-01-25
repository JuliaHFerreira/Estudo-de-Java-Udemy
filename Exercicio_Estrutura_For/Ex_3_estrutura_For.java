package Exercicio_Estrutura_For;
import java.util.Locale;
import java.util.Scanner;

public class Ex_3_estrutura_For {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double media;
		
		for(int i = 0; i<n ; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			n1 *=2;
			n2 *=3;
			n3 *=5;
			media = (n1+n2+n3)/10;
			System.out.printf("%.1f%n%n", media);
		}
		
		sc.close();

	}

}
