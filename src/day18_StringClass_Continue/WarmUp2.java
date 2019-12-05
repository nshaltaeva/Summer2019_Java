package day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args) {
		
	/*	Ex:
			enter your first name
			mUhTaR
			enter your last name
			cYBerTeK
			output:
			Muhtar Cybertek
		*/	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first and last name");
		String firstName = scan.nextLine();
		String lastName = scan.nextLine();
		
		firstName = firstName.substring(0,1).toUpperCase()+
				firstName.substring(1).toLowerCase();
		
		lastName = lastName.substring(0,1).toUpperCase()+
				lastName.substring(1).toLowerCase();
		System.out.println(firstName+" "+lastName);
		
	//	firstName = (""+ firstName.charAt(0)).toUpperCase();		
		
		//System.out.println(FullName);
		
		
		
		
		
		
		
		
		
	}

}
