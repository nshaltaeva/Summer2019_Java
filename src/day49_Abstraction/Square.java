package day49_Abstraction;

public class Square extends Shape{
	
	/*
	 * Area of the square:     side * side
	 * Perimeter of Square: 4 * side
	 */
	
	double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	protected void Area() {
		double Area = side*side;
		System.out.println("Area of Square is "+Area);
	}
	
	protected void Perimeter() {
		double Perimeter = 4*side;
		System.out.println("Perimeter of Square is "+Perimeter);
	}

}
