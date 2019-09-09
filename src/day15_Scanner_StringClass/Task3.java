package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task3 {
	 
	public static void main(String[] args) {
		
	
	/*
	 
	 */

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your first name");
	String fName = input.nextLine();
	System.out.println("Enter your last name");
	String lName = input.nextLine();
	String fullName = lName+ " "+ fName;
	System.out.println("Your full name is "+lName+" "+fName);
	System.out.println("Your full name is "+fullName);
	
	
	
	input.close(); //it close the Scanner (gets rid of warning of the scanner class)
	
	
	
	
	
	
	
	
	
}
}