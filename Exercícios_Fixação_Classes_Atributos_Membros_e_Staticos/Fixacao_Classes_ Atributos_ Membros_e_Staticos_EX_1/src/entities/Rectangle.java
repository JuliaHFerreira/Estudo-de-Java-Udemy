package entities;

public class Rectangle {
	public double width;
	public double heigth;
	
	public double area() {
		return width * heigth;
	}
	
	public double perimeter() {
		return 2 * (width + heigth);
	}
	public double diagonal() {
		return Math.sqrt((width * width) + (heigth * heigth));
		
	}
	public String toString() {
		return String.format("%nArea: %.2f", area())
				+ String.format("%nPerimeter: %.2f", perimeter())
				+ String.format("%nDiagonal: %.2f", diagonal());
	}
}
