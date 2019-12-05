package OfficeHour;

import java.util.Scanner;

public class email {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an email:");
		
		String email = scan.nextLine();
		
		//I need to name until@
		//I need to get everything after@
		int indexOfAt = email.indexOf('@');
		String emailId = email.substring(0,indexOfAt);
		String domain = email.substring(indexOfAt+1,email.length());
		System.out.println("Email ID: "+emailId);
		System.out.println("Domain: "+domain);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
