package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.printf("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println();
			System.out.printf("Emplyoee #%d", i+1);
			
			System.out.print("\nId: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			list.add(new Employee(id,name,salary));
		}
		
		System.out.printf("\nEnter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double porcentage = sc.nextDouble();
			emp.increaseSalary(porcentage);
		}
		
		System.out.println("\nList of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		sc.close();

	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
