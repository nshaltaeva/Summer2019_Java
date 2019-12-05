package ReplIt;

import java.util.Scanner;

public class Method_HamletQuote {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean toBe = scan.nextBoolean();
		boolean notToBe = scan.nextBoolean();
		
		boolean res = hamletQuote(toBe, notToBe);
		
		System.out.println(res);
		
	}
	
	
	public static boolean hamletQuote(boolean toBe,boolean notToBe)
	  {
	   return (toBe == true && notToBe != true)?true:
		   (toBe != true && notToBe == true)?true:
			   (toBe == true && notToBe != false)?true: false;   
	    
	  }

}
