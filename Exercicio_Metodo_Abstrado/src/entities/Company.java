package entities;

public class Company extends TaxPayer{
	
	private int numberOfEmployees;

	public Company(String name, Double anuallncome, int numberOfEmployees) {
		super(name, anuallncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double Tax() {
		Double result=0.0;
		if(numberOfEmployees<=10) {
			result=anuallncome*0.16;
		}
		else {
			result=anuallncome*0.14;
		}
		return result;
	}

}
