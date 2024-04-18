package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Enter the following data: ");
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double porcentage = sc.nextDouble();
		employee.increaseSalary(porcentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		sc.close();
	}

}
