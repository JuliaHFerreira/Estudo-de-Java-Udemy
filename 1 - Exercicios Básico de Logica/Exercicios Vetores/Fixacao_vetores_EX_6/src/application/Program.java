package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many values will each vector have?");
		int n = sc.nextInt();
		int vect1[] = new int [n];
		int vect2[] = new int [n];
		int vectSoma[] = new int [n];
		
		System.out.println("Enter the values of vector A: ");
		for(int i=0; i<vect1.length; i++) {
			vect1[i] = sc.nextInt();
		}
		System.out.println("Enter the values of vector B: ");
		for(int i=0; i<vect2.length; i++) {
			vect2[i] = sc.nextInt();
		}
		System.out.println("Resulting vector: ");
		for(int i=0; i<n; i++) {
			vectSoma [i] = vect1[i] + vect2[i];
			System.out.println(vectSoma[i]);
		}
		
		
		
		sc.close();

	}

}
