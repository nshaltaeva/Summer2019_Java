package day37_ClassAndObject;

public class CarObjects {
	
	public static void main(String[] args) {
		
		Car         car1   =   new      Car();
//    classname	  objName	keyword   constructor
		
		car1.Brand = "BMW";
		car1.Color = "Silver";
		car1.mileage = 100;
		car1.Model = "X6";
		car1.price = 15000.5;
		car1.Year = 2000;
		
		System.out.println(car1.Brand);
		System.out.println(car1.Color);
		System.out.println(car1.mileage);
		System.out.println(car1.Model);
		System.out.println(car1.price);
		System.out.println(car1.Year);
		
		
		
		
		
		
		System.out.println("====================================");
		
		Car car2 = new Car();
		
		car2.Brand = "Toyota";
		car2.Color = "black";
		car2.mileage = 40000;
		car2.Model = "Corolla";
		car2.price = 2000;
		car2.Year = 2002;
		System.out.println(car2.Brand);
		System.out.println(car2.Color);
		System.out.println(car2.mileage);
		System.out.println(car2.Model);
		System.out.println(car2.price);
		System.out.println(car2.Year);
		
		System.out.println("================================");
		
		car1.drive();
		car2.drive();
		
		car1.start();
		car2.start();
		
		car2.getInfo();
		
	System.out.println("=======================================");	
		
		Car car3 = new Car();
		car3.getInfo();//default values
		
		car3.Brand = "Lexus";
		car3.Model = "RX350";
		car3.Year = 2020;
		car3.mileage = 25000;
		car3.Color = "Purple";
		car3.price = 200000;
		
		car3.getInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
