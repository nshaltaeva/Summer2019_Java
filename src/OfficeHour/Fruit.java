package OfficeHour;

public class Fruit {
	
	public static void main(String[] args) {
		
		int appleQuantity = 2;
		
		String fruit = "banana";
		
		System.out.println("I ate "+appleQuantity+ " apples and 1 "+fruit);
		
		String firstName = "Nurzat";
		String lastName = "Shaltaeva";
		System.out.println(firstName + " " + lastName);
		
		System.out.println("I like 'apple' ");
		System.out.println("Java is \"fun\"!");
		
		
		double beforeTax = 67.85;
		double taxRate = 0.09;
		double aftertax = (beforeTax*taxRate)+beforeTax;
		
		System.out.println("Before tax the price is "+beforeTax+", after tax the price will be "+aftertax);		
		
		double afterTax = beforeTax += beforeTax*taxRate;
		System.out.println(afterTax);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
