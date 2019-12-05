package day49_Abstraction;

public class Cylinder extends Shape{
	/*
	 * Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
	   Volume of cylinder: 3.14 * radius * radius * height
	 */

	final double Pi = 3.14;
	double radius;
	double height;
	double diameter;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
		diameter = 2*radius;
	}
	
	@Override
	protected void Area() {
		double Area = (Pi*radius*diameter) + height*(Pi*diameter);
		System.out.println("Area of Cylinder is "+Area);
	}
	
	@Override
	protected void Perimeter() {
		//2(Pi*D+h)
		double Perimeter = 2*(Pi*diameter+height);
		System.out.println("Perimeter of Cylinder is "+Perimeter);
	}
	
	@Override
	protected void Capacity() {
		double Volume = Pi*radius*radius*height;
		System.out.println("Volume of Cylinder is "+Volume);
	}
}
