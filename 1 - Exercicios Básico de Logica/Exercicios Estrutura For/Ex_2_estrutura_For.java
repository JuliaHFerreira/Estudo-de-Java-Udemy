package Exercicio_Estrutura_For;
import java.util.Scanner;

public class Ex_2_estrutura_For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, num;
		int in = 0; 
		int out = 0;
		
		System.out.println("Insira a quantidade de valores lidos: ");
		n = sc.nextInt();
		
		for(int i=0 ; i<n; i++) {
			num = sc.nextInt();
			
			if(num>=10 && num<=20) {
				in +=1; 
			}
			else {
				out+=1;
			}
		}
		System.out.printf("%n%d in", in);
		System.out.printf("%n%d out", out);
		sc.close();

	}

}