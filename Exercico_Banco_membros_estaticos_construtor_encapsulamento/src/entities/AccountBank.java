package entities;

public class AccountBank {
	
	private int numberAccount;
	private String name;
	private double deposit;
	public static final double bankTax = 5.00;
	
	public AccountBank() {
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}
	
	public int numberAccount(int numberAccount) {
		return this.numberAccount=numberAccount;
	}
	
	public double deposit(double deposit) {
			return this.deposit+=deposit;
	}
	
	public double withdraw(double withdraw) {
		return deposit-=withdraw+bankTax;
	}
	public String toString() {
		return "Account "
				+numberAccount
				+", Holder: "
				+name
				+", Balance: $ "
				+String.format("%.2f", deposit);
	}
}
