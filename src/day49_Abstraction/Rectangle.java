package day49_Abstraction;

public class Rectangle extends Shape{
	/*
	 *  Area of the rectangle:  width * length
	 *  Perimeter of rectangle: (width + length) * 2
	 */

	double length;
	double width;
	
	//to do not assign every time length and width, we created constructor with args
	public  Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	protected void Area() {
		double Area = length*width;
		System.out.println("Area of Rectangle is "+Area);
	}
	
	@Override
	protected void Perimeter() {
		double Perimeter = (length+width)*2;
		System.out.println("Perimeter of Rectangle is " +Perimeter);
	}
	
}
