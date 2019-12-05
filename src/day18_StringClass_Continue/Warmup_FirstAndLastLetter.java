package day18_StringClass_Continue;

import java.util.Scanner;

public class Warmup_FirstAndLastLetter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first and last names");
		String firstName = input.nextLine();
		String lastName = input.nextLine();
		
		String initials = firstName.substring(0,1)+"."+lastName.substring(0,1);
		System.out.println("Initial is: "+initials.toUpperCase());
		
		String initials2 =""+ firstName.charAt(0)+"."+lastName.charAt(0);
		System.out.println("Initial is: "+initials2.toUpperCase());
		
		System.out.println(firstName.charAt(0)+"."+lastName.charAt(0));
		
		System.out.println(firstName.charAt(0)+lastName.charAt(0));//print from ASCII table
		
		String LastLetters = ""+firstName.charAt(firstName.length()-1)
				+"."+lastName.charAt(lastName.length()-1);
		System.out.println("Last letter are: "+LastLetters.toLowerCase());
		
		String LastLetter2 = firstName.substring(firstName.length()-1);
		
		System.out.println(LastLetter2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
