package day19_forLoop;

import java.util.Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		/*
		 Given: username: cybertek.batch12@gmail.com
		 		password: Javengers
		 	write a program for login functionality of the gmail acconut
		 	(user input require)
		 	if username 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your username");
		String user = input.nextLine().toLowerCase();
		System.out.println("Enter your password");
		String pass = input.nextLine();
		
		String username = "cybertek.batch@gmail.com";
		String password = "Javengers";
	
		
		if(user.endsWith("@gmail.com")) {
			if(user.equalsIgnoreCase(username) && pass.equals(password)) {
				System.out.println("Logged in succesfully");
			}else {
				System.out.println("Invalid username and password");
			}
		}else {
			System.out.println("it's not a valid email address");
		}
		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
