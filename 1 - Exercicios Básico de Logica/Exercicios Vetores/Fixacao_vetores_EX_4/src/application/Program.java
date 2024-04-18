package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantPairs = 0;
		
		System.out.println("Enter the quantity of numbers you will type: ");
		int n = sc.nextInt();
		int vect [] = new int [n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.printf("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("\nPair numbers:");
		for(int i = 0; i<vect.length; i++) {
			if(vect[i]%2==0) {
				System.out.printf(vect[i] + "  ");
				quantPairs++;
			}
		}
		System.out.printf("\n\nQuantity of numbers pairs = " + quantPairs);
		
		sc.close();

	}

}
