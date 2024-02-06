package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double mediaHei = 0;
		double percentage = 0;
		
		System.out.print("How many people will be typed?: "); 
		int n = sc.nextInt();
		Pessoa vect [] = new Pessoa [n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.printf(i+1 + " st person data:\n"); 
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Age: ");
			int age = sc.nextInt();
			System.out.printf("Height: ");
			double height = sc.nextDouble();
			vect[i] = new Pessoa(name, age, height);
			System.out.println();
		}
		for(int i = 0; i<vect.length; i++) {
			mediaHei += vect[i].getHeight();
			if (vect[i].getAge()<16) {
				percentage++; 
			}
		}
		percentage = (percentage/vect.length)*100;
		mediaHei = mediaHei/vect.length;
		System.out.printf("Average height: %.2f\n",mediaHei);
		System.out.printf("People under 16 years: %.1f%%\n",percentage);
		
		for(int i = 0; i<vect.length; i++) {
			if (vect[i].getAge()<16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();

	}

}
