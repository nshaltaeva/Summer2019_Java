package day21_WhileLoops;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		
		System.out.println("addition is: "+(a+b));
		System.out.println("Do you want to continue?");
		
		String answer = scan.next();
		if (answer.equalsIgnoreCase("no")) {
			break;
		}
		//else {
		//	System.out.println("completed");
		//}
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
