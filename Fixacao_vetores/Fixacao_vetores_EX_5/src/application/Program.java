package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int highNumber = 0, positionHighNumber = 0;
		
		System.out.println("Enter the quantity of numbers you will type: ");
		int n = sc.nextInt();
		int vect [] = new int [n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.printf("Enter a number: ");
			vect[i] = sc.nextInt();
			
			if(i>0 && vect[i]>vect[i-1]) {
				highNumber = vect[i];
				positionHighNumber = i;
			}
		}
		System.out.printf("\nHighest value: " + highNumber);
		System.out.printf("\nPosition of highest value: " + positionHighNumber);
		
		
		sc.close();

	}

}
