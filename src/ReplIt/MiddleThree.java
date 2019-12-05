package ReplIt;

import java.util.Scanner;

public class MiddleThree {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		if (word.length() >=5 && word.length() % 2 == 1){
		      int a = word.length()/2 ;
		      System.out.println(word.substring(a-1,a+2));
		     
		    }else {
		    	System.out.println("invalid");
		    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
