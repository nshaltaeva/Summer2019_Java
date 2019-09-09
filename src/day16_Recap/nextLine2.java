package day16_Recap;

import java.util.Scanner;

public class nextLine2 {
	
	/*
	 zipcode, city, state, phone num
	 
	 do not use next();
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your zip code");
		int zip = input.nextInt();
		//123679 Enter (Enter saved in memory)
		
		input.nextLine();//takes out the"Enter"
		
		System.out.println("Please enter your city name");
		String city = input.nextLine();
		
		
		
		System.out.println("Enter your phone number");
		int ph = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter state");
		String state = input.nextLine();
		
		
		System.out.println("Zip code is: "+zip);
		System.out.println("City name is: "+city);
		System.out.println("Phone num code is: "+ph);
		System.out.println("State name is: "+state);
		
		
		
		
		
		
		
	}
}
