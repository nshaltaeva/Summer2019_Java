package ReplIt;

import java.util.*;

public class EvenOddNums {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
         	if(i%2 == 0) 
         	System.out.print(i+", ");
         
         }
         System.out.println();
		
		
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	   
	    //CODE HERE 
		
		if (number % 2 == 0) {
			System.out.println(number+" is even");
		}else {
			System.out.println(number+" is odd");
		}
		
		
		 
		
		
		
		
		
		
		
	}

}
