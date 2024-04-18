package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0, media = 0.0;
		
		System.out.println("Enter the size of the vector: ");
		int n = sc.nextInt();
		double [] vect = new double [n]; 
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		System.out.print("Values: "); 
		for(int i=0; i<vect.length; i++) { // Printing numbers and sum them
			System.out.printf("%.1f ", vect[i]);
			sum += vect[i];
		}
		media = sum/vect.length;
		System.out.println("");
		System.out.printf("Sum: %.2f%n", sum);
		System.out.printf("Media: %.2f%n", media);
		sc.close();
	}
}
