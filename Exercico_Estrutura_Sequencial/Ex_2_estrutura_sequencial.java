package Exercico_Estrutura_Sequencial;
import java.util.Locale;
import java.util.Scanner;
public class Ex_2_estrutura_sequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double raio, area;
		double pi = 3.14159;
		
		System.out.println("Insira o raio do circulo: ");
		raio = sc.nextDouble();
		
		area = pi * (raio*raio);
		System.out.printf("A área do cirulo é %.4f", area);
		
		sc.close();
	}
}
