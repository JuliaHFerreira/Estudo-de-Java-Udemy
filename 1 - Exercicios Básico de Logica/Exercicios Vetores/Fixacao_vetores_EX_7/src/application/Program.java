package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many person you will to type?");
		int n = sc.nextInt();
		Person vect[] = new Person[n];
		
		int nOld = 0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.printf(i+1 + "st person data: ");
			System.out.printf("\nName: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Age: ");
			int age = sc.nextInt();
			vect[i] = new Person(name, age);
			
			if(i>0 && vect[i].getAge() > vect[i-1].getAge()) {
				nOld = i;
			}
		}
		
		System.out.printf("\n\nOlder person: "+ vect[nOld].getName());
		sc.close();

	}

}
