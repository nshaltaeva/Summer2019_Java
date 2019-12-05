package day49_Abstraction;

public class Shape {
	
	/*
	 WarmUp: 
    1. create a class called Shape
            Actions: Area(), perimeter(), capacity()
    2. create sub classes of Shape:
                        Circle
                        rectangle
                        square
                        cylinder
        and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
    3. override super class' Area(), perimeter(), capacity() methods to the sub classes
	Formulas:
    Area of the circle:     3.14 * radius * radius
    Area of the rectangle:  width * length
    Area of the square:     side * side
    Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
    Perimeter of circle:    3.14 * 2 * radius
    Perimeter of rectangle: (width + length) * 2
    Perimeter of Square: 4 * side
    volume of cylinder: 3.14 * radius * radius * height . 
	 */
	
	protected void Area() {
		System.out.println("Area is 0");
	}
	
	protected void Perimeter() {
		System.out.println("Perimeter is 0");
	}
	
	protected void Capacity() {
		System.out.println("Volume is 0");
	}
	
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle( 100, 200); //
			//	rectangle.length = 10;
			//	rectangle.width = 20;
				  rectangle1.Area();
				  rectangle1.Perimeter();
		Rectangle rectangle2 = new Rectangle(15, 30);
				  rectangle2.Area();
				  rectangle2.Perimeter();
				  
	    Square square = new Square(10);
	    	   square.Area();
	    	   square.Perimeter();
	    Square square2 = new Square(20);
	    	   square2.Area();
	    	   square2.Perimeter();
	    	   
	    Circle circle = new Circle(25);
	    	   circle.Area();
	    	   circle.Perimeter();
	    	   
	    Circle circle2 = new Circle(5);
	    	   circle2.Area();
	    	   circle2.Perimeter();
	    	   
	    Cylinder cylinder = new Cylinder(2, 5);
	    		 cylinder.Area();
	    		 cylinder.Perimeter();
	    		 cylinder.Capacity();
				  
		
	}

}
