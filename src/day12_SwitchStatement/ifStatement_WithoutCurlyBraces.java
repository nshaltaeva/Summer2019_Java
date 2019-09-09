package day12_SwitchStatement;

public class ifStatement_WithoutCurlyBraces {
	
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Hello");
			System.out.println("Hello1");
		} else {
			System.out.println("world");
		}
		
		//without curly brace: a single line of statement
		if (true)
			System.out.println("Hello");
	//		System.out.println("Hello1"); 
		//without {} if block cannot hold more than one statement
		else 
			System.out.println("World");
		
		//Nested if without curly braces
		if(true)
			if(true)
				System.out.println("Hello World");
			else System.out.println("Hello Cybertek");
		else 
			System.out.println("Invalid");
		
		//nested if with {}
		if(true) {
			if(true) {
				System.out.println("Hello World");
			}
			else System.out.println("Hello Cybertek");
		}
		
		//multi-branch
		int grade = 80;
		if (grade <= 100 && grade >= 0) {
		if (grade >90) {
			System.out.println("A");
		}
		else if (grade >= 80) {
			System.out.println("B");
		}
		else if (grade >= 70) {
			System.out.println("C");
		}
		}
		else {System.out.println("Invalid");}
		
		
		
		//without {}
		if (grade <= 100 && grade >= 0)
			if (grade >= 90)  
				System.out.println("A");
			else if (grade >= 80) 
				System.out.println("B");
			else if (grade >= 70) 
				System.out.println("C");
			else System.out.println();
		else System.out.println("Invalid");
		
		
		
		
		
		
		
		
	}

}
