package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student= new Student();
		
		System.out.println("Enter the following data: ");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", student.finalMedia());
		
		if (student.finalMedia() < 60.0) {
			
			System.out.println("FAILED");
			System.out.println();
			System.out.printf("Missing %.2f Points%n", student.faildPoints());
		}
		else {
			
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
