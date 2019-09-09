package day10_Ifstatement;

public class if_else_statement {
	
	/*
	 if&else
	 			if (condition) {
	 			 //A           
	 			 // if block gets executed if the condition is true
	 			 } else {
	 			 //B            
	 			 // else block only executed if the condition is false
	 			 }
	 	*/
		
	public static void main(String[] args) {
		 
		/*if (9>8) {
			System.out.println("9 is greater than 8");
		}
		if (9<8) {
			System.out.println("9 is less than 8");
		}
		if (9==8) {
			System.out.println("9 is equal to 8");
		}
		*/
		
		if (9<=8) {
			System.out.println("9 is less or equal to 8");
		}
		else {
			System.out.println("9 is greater than 8");
		}
//if 9 is not greater or equal to 8,then 9 is must be less than 8		
		
		if (false == !false) {
			System.out.println("if block");
		} else {
			System.out.println("else block");
		}
		
		/*
		 if score < 60 ==> failed
		 if sore >= 60 but score < 90 ==> pass
		// if score >= 90  ==> passe with Distinction
		 */
		
		int score = 59;
		
		if (score >= 60) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
	/*	if (score >=90) {
			System.out.println("you have made A+, good job");
		} else {
			System.out.println("You coudn't make A+");
		}
	*/	
		
		/*
		 1. triangle : has three angles'
		 and sum of 3 angles must be equal 180
		     a. declare 3 variables angle1, angle2, angle3
		     b. write a program to check if the triangle is valid or not
		 */
		
		int angle1 = 20, angle2 = 50, angle3 = 75;
		boolean valid = (angle1+angle2+angle3) == 180;
		
		if (valid) {
			System.out.println("it is a valid triangle");
		} else {
			System.out.println("Invalid triangle, do some math");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
