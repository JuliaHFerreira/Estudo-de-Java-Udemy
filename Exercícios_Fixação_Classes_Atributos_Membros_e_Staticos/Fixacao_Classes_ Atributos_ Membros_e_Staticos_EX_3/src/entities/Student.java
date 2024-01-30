package entities;

public class Student {
	public String name;
	public double grade1, grade2, grade3;
	
	public double finalMedia() {
		return (grade1 + grade2 + grade3);
	}
	public double faildPoints() {
		if (finalMedia()<60){
			return 60 - finalMedia();
		}
		else {
			return 0;
		}
		
	}
}
