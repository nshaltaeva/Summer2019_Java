package ReplIt;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    /*
	     Write a program that will print out information about user based on email. Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
	     */
	    int indexOfSlash = email.indexOf('_');
	    int indexOfAt = email.indexOf('@');
	    int indexOfDot = email.indexOf('.');
	    
		String firstName = email.substring(0,indexOfSlash);
		firstName = firstName.substring(0,1).toUpperCase()+
				firstName.substring(1).toLowerCase();
		String Lastname = email.substring(indexOfSlash+1, indexOfAt);

		Lastname = Lastname.substring(0,1).toUpperCase()+
				Lastname.substring(1).toLowerCase();
		String domain = email.substring(indexOfAt+1,indexOfDot);
		String TopLevelDomain = email.substring(indexOfDot+1, email.length());
		System.out.println("First name: "+firstName);
		System.out.println("Last name: "+Lastname);
		System.out.println("Domain: "+domain);
		System.out.println("Top-Level Domain: "+TopLevelDomain);
	    
		
		
	    
	    
	    
	    
	    
	    
	    
	}

}
