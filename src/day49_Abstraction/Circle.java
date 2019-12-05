package day49_Abstraction;

public class Circle extends Shape {
	/*
	 * Area of the circle:     3.14 * radius * radius
	 * Perimeter of circle:    3.14 * 2 * radius
	 */

	double radius;
	double diameter;
	final double Pi = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
		diameter = radius*2;
	}
	
	@Override
	protected void Area() {
		double Area = Pi*radius*radius;
		System.out.println("Area of Cicle is "+Area);
	}
	
	@Override
	protected void Perimeter() {
		double Perimeter = Pi*diameter;
		System.out.println("Perimeter of Circle is "+Perimeter);
	}
}
