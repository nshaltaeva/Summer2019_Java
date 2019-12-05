package ReplIt;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
	  /*  
	    int factorial = 1;
	    int i = n;
	    while (i <= 1) {
	     factorial *= n;
	     n++;
	    }
	   System.out.println("The factorial is:"+factorial);
	  */
	   long x, fact = 1;
	     for ( x = n; x > 1; x--) // iterating from n -> n-1 -> n-2 ... 1
	      {
	         fact *= x;              // multiplying each number into the fact variable to get the factorial
	       }
	      System.out.println(fact);
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
