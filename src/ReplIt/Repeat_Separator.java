package ReplIt;

import java.util.Scanner;

public class Repeat_Separator {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    
	    
	    String  bigString= "";
	    
	      for (int i = 0; i < count; i++) {
	          if (i < count-1) {
	         bigString += word + separator;
	          }
	        else {	    
	          bigString += word;
	        }
	      }	    
	   System.out.println(bigString);
	    
	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  }
}
