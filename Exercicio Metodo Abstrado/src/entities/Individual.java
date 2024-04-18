package entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;
	
	public Individual() {
	}

	public Individual(String name, Double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double Tax() {
		Double result=0.0;
		
		if(anuallncome<20000.00) {
			result=anuallncome*0.15 - healthExpenditures*0.50;
		}
		else {
			result=anuallncome*0.25 - healthExpenditures*0.50;
		}
		return result;
	}
	
	

}
