package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students will be typed?");
		int n = sc.nextInt();
		Student vect[] = new Student[n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.printf("Enter the name, first and second grade of the %dst student:\n",i+1);
			sc.nextLine();
			String name = sc.nextLine();
			double note1 = sc.nextDouble();
			double note2 = sc.nextDouble();
			vect[i] = new Student(name, note1, note2);
		}
		
		System.out.println("\nApproved Students:");
		for(int i = 0; i<vect.length; i++) {
			double sum = (vect[i].getNote1() + vect[i].getNote2())/2;
			
			if(sum>=6) {
				System.out.println(vect[i].getName());
			}
		}
		
		
		sc.close();
	}

}
