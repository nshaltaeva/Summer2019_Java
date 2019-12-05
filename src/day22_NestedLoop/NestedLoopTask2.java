package day22_NestedLoop;

import java.util.Scanner;

public class NestedLoopTask2 {
public static void main(String[] args) {
	
	while(true) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("Multiplication is: "+(a*b));
	System.out.println("Do you want to continue?");
	scan.nextLine();
	String answer = scan.nextLine().toLowerCase();	
	
	while(!(answer.equals("yes") || answer.equals("no"))) {
		System.out.println("Please re-enter again");
		System.out.println("Do you want to continue");
		answer = scan.nextLine();
	}
	
	
	
	if(answer.equals("no")) {
		break;
	}
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
