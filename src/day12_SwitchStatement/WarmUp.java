package day12_SwitchStatement;

public class WarmUp {
	/*
	 WarmUp
	 declare 3 numbers
	 if n1 and n2 are equal
	    => n1&n2 are equal
	  if n2 and n3 are equal
	       => n2&n3 are equal
	  if n3 and n1 are equal 
	         => n3$n1 are equal
	  if all equal ==> all equal
	  if none of them are equal => none of then are equal
	  Do not use single if statement
	 */

			public static void main(String[] args) {
				
			// solution 1:
				
				int n1 = 4, n2 = 5, n3 = 1;
				
				
				   if(n1 == n2 && n1 != n3) { //true
			            System.out.println("n1 and n2 equal");
			        } else if (n2 == n3 && n2 != n1) {
			            System.out.println("n2 and n3 equal");
			        } else if (n3 == n1 && n3 != n2) {
			            
			            System.out.println("n3 and n1 equal");
			        }else if (n1 == n2 && n2 == n3 && n1 == n3 ) {
			            System.out.println("all equal");
			        }
			        else {
			            System.out.println("none of then are equal");
			        }
				   System.out.println("======================");
				// solution 2 MultiBranch
				   
				   int num1 = 4, num2 = 9, num3 = 5;
				   
				   if (num1 == num2 && num2 == num3) {
					   System.out.println("All equal");
				   } 
				   else if (num1 == num2) {
					   System.out.println("Num1 and Num2 are equal");
				   }
				   else if (num2 == num3) {
					   System.out.println("Num2 and Num3 are equal");
				   }
				   else if (num1 == num3) {
					   System.out.println("Num1 and Num3 are equal");
				   }
				   else {
					   System.out.println("None of them are equal");
				   }				   
				  
				   System.out.println("==========================");
				   
				 //solution 3 Nested If
				   
				   int A = 10, B = 20, C = 30;
				   
				   if (A == B && B == C) { //if all are equal
					   System.out.println("All are equal");
				   } else {//if not all of them are equal
					 if (A == B) {
						 System.out.println("A and B are equal");
					 }  
					 else if (A==C) {
						 System.out.println("A and C are equal");
					 } 
					 else if (B == C) {
						 System.out.println("B and C are equal");
					 } 
					 else {
						 System.out.println("None of them are equal");
					 }
					 
									   
					   
				   }
				   
				   
				   System.out.println("=========================");
					
					/*
					 0~59 => F
					 60~70 => D
					 70~80 => C
					 80~90=> B
					 90~100=> A
					 grade must be 0~100
					 */
					
				   int grade = 110;
				  
				   if (grade >=0 && grade <= 100) {
				 
				   if (grade >= 60) {
				    	if (grade >= 90) {
				    		System.out.println("A");
				    	}
				    	else if (grade >= 80) {
				    		System.out.println("B");
				    	}
				    	else if (grade >= 70) {
				    		System.out.println("C");
				    	}
				    	else {
				    		System.out.println("D");
				    	}
				   } 
				    	else {
				    		System.out.println("Failed");
				    	}
					   
				      
				   
				   } else {
					   System.out.println("Invalid Entry");
				   } 
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
			}
}
