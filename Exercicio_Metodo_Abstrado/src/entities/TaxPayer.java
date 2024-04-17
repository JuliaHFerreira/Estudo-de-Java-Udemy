package entities;

public abstract class TaxPayer {
	
	private String name;
	protected Double anuallncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double anuallncome) {
		this.name = name;
		this.anuallncome = anuallncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuallncome() {
		return anuallncome;
	}

	public void setAnuallncome(Double anuallncome) {
		this.anuallncome = anuallncome;
	}
	
	public abstract Double Tax();
}
