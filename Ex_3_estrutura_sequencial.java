package Exercico_Estrutura_Sequencial;
import java.util.Scanner;
public class Ex_3_estrutura_sequencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = (A*B)-(C*D);
		
		System.out.printf("Diferença = %d", dif);
		
		sc.close();

	}

}
