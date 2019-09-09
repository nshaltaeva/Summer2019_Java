package day17_StringClass;

import java.util.Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		
		//Task01
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first and last name");
		String firstname = scan.nextLine();
		String lastname = scan.nextLine();
		
		String fullname = firstname.concat(" "+ lastname);
		
		int num = fullname.length();
		
		System.out.println(fullname+ " contains "+num+" characters");
	int lastIndexNum = fullname.length()-1;
		System.out.println("Last character full name is: "+ fullname.charAt(lastIndexNum));
	
	
	
	
	}

}
