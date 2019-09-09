package day15_Scanner_StringClass;

import java.util.Scanner;

public class StringInput {
	
	/*
	 next vs nextLine();
	 */
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your first name");
	String firstname = scan.nextLine();
	
	System.out.println("Enter your last name");
	String lastname = scan.nextLine();
	
	System.out.println(firstname+" "+lastname);
	
	System.out.println("Enter char value");
	char ch = scan.next().charAt(6);
	System.out.println(ch);
	
	
	
	
	
	
	
	
	
}
}
