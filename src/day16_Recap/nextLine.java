package day16_Recap;

import java.util.Scanner;

public class nextLine {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your phone number");
		int phoneNum = scan.nextInt();
		//12222222 Enter
		
		scan.nextLine();
		
		System.out.println("Enter your Name");
		String name = scan.nextLine();
		//will take evrything in scanner's memory 
		// (including Enter)up-to the new line
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
