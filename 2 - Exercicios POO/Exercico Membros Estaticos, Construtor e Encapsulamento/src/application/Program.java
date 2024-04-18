package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountBank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AccountBank accountBank = new AccountBank();
		
		System.out.println("Welcome to the Test Bank!");
		System.out.println("Enter account number: ");
		int numberAccount = sc.nextInt();
		accountBank.numberAccount(numberAccount);
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		accountBank.setName(name);
		System.out.println("Is there na initial deposit (y/n)?");
		char opc = sc.next().charAt(0);
		
		double deposit = 0;
		if(opc == 'y' || opc == 'y') {
			System.out.println("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			accountBank.deposit(deposit);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(accountBank.toString());
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		deposit = sc.nextDouble();
		accountBank.deposit(deposit);
		System.out.println("Updated account data ");
		System.out.println(accountBank.toString());
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		accountBank.withdraw(withdraw);
		System.out.println("Updated account data ");
		System.out.println(accountBank.toString());
		
		sc.close();

	}

}
