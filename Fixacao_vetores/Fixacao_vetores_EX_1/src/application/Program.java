package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of the vector (Maximum 10): ");
		int n = sc.nextInt();
		int [] vect = new int [n]; 
		if(n<=10) {
			for(int i = 0; i<vect.length; i++) {
				System.out.println("Enter a positive or negative number: ");
				vect[i] = sc.nextInt();
			}
			System.out.println();
			for(int i = 0; i<vect.length; i++) {
				if(vect[i]<0) {
					System.out.println(vect[i]);
				}
			}
		}
		else {
			System.out.println("Enter a maximum of 10 vectors ");
		}
		sc.close();
	}

}
