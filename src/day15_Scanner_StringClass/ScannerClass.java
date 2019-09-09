package day15_Scanner_StringClass;

import java.util.Scanner;
//imports class scanner from java.util

//import java.util.Scanner; ==>
//==> imports all classes from java.util

/*     package name : java.util
     class name: Scanner
*/
public class ScannerClass {
	
	public static void main(String[] args) {
		
		/*
		 Decleration of scanner class:
		 Scanner variableName = new Scanner(System.in)
		 
		 variableName can reference an object of scanner class
		 
		 new Scanner(System.in): creates an object 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter byte value:");
		byte num = input.nextByte();//returns the user input as byte value
		
		System.out.println("Enter short value:");
		short num2 = input.nextShort();//returns the user input as short value
		
		System.out.println("Enter int value:");
		int num3 = input.nextInt();//returns the user input as int value
		
		System.out.println("Enter long value:");
		long num4 = input.nextLong();//returns the user input as long value
		
		System.out.println("Enter boolean value:");
		boolean result = input.nextBoolean();
		
		System.out.println("Enter float value:");
		float num5 = input.nextFloat();
		
		System.out.println("Enter double value:");
		double num6 = input.nextDouble();
		
	//	System.out.println("Enter your first name:");
	//	String str = input.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
