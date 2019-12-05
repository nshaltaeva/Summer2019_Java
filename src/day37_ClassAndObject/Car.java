package day37_ClassAndObject;

public class Car {
/*
 car
    data/attribute
        model, Year, brand, color, price, milage,VIN....
    actions:
        start, driver, accelerate, stop, drift, brake, get ticket..
 */
	String Model;
	int Year;
	String Brand;
	String Color;
	double price;
	long mileage;
	
	public void drive() {
		System.out.println("Driving "+Brand);
	}
	
	public void start() {
		System.out.println(Brand+ " is starting");
	}
	
	public void getInfo() {
		System.out.println(Year+ " "+ Brand+" "+Model+", "+mileage+" miles, "+Color+", $"+price);
	}
	
	
	
	
	
	
	
	
	
	
}
