package day10_Ifstatement;

public class Nested_if {
	
	/*
	 Nested if:
	 if (condition1){
	 			if (condition2){
	 			      //some code
	 			}
	 }
	 */

	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Hello Cybertek");
			if(false) {
				System.out.println("Hello Programmers");
			} else {
				System.out.println("Hello Team SDET");
			}
			}
		System.out.println("===============================");
		
		/*
		 Task_01
		     90 <= grade  <=100    ==> A
		     80 <= grade < 90 ==>B
		     70 <= grade < 80 ==>C
		     60 <= grade < 70 ==>D
		     else             ==>F
		 */
		int grade = 110;
		if (grade >= 60 && grade <= 100) {
			System.out.println("Passed");
			if (grade >= 90 && grade <= 100) {
				System.out.println("\twith an A");
			} 
			else if (grade >= 80 && grade < 90) {
				System.out.println("\twith a B");
			}
			else if (grade >= 70 && grade < 80) {
				System.out.println("\twith a C");
			} 
			else { //60 <= grade <70
				System.out.println("\twith a D");
			}
			
			
		}
		else {
			if (grade < 60) { // either less than 60 or greater than 100
				System.out.println("Failed");	
			}
			else {// greater than 100
				System.out.println("Invalid score");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
