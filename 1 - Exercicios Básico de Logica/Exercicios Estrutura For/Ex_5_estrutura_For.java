package Exercicio_Estrutura_For;
import java.util.Scanner;

public class Ex_5_estrutura_For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fat = 1;
		
		for(int i = 1 ; i<=n ; i++) {
			if(n==0) {
				System.out.println("1");
			}
			else{
				fat = fat * i;
			}
		}
		System.out.println(fat);
		sc.close();

	}

}
