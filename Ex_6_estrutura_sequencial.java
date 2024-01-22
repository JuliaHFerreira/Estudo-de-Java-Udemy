package Exercico_Estrutura_Sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Ex_6_estrutura_sequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTria, areaCirc, areaTrap, areaQuad, areaRetan;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTria = (A*C)/2;
		areaCirc = (C*C)*3.14159;
		areaTrap = ((A+B)*C)/2;
		areaQuad = B*B;
		areaRetan = A*B;
		
		System.out.printf("TRIANGULO: %.3f%n",areaTria);
		System.out.printf("CIRCULO: %.3f%n",areaCirc);
		System.out.printf("TRAPEZIO: %.3f%n",areaTrap);
		System.out.printf("QUADRADO: %.3f%n",areaQuad);
		System.out.printf("RETANGULO: %.3f%n",areaRetan);
		
		sc.close();
	}

}
