package Exercico_Estrutura_Sequencial;
import java.util.Locale;
import java.util.Scanner;
public class Ex_4_estrutura_sequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, horas;
		double vlrHrs, salario;
		
		System.out.println("Enter the employee number: ");
		n = sc.nextInt();
		System.out.println("Enter the hours worked in the month: ");
		horas = sc.nextInt();
		System.out.println("Enter the salary amount per hour worked: ");
		vlrHrs = sc.nextDouble();
		
		salario = vlrHrs*horas;
		
		System.out.printf("%nNumber = %d%n", n);
		System.out.printf("Salary: U$ %.2f", salario);
		
		sc.close();
	}

}
