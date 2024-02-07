package entities;

public class Student {
	
	private String name;
	private double note1;
	private double note2;
	
	public Student(String name, double note1, double note2) {
		this.name = name;
		this.note1 = note1;
		this.note2 = note2;
		
	}
	public double getNote1() {
		return note1;
	}
	public double getNote2() {
		return note2;
	}
	public String getName() {
		return name;
	}
	
	

}
