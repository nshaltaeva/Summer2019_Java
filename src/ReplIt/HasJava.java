package ReplIt;

import java.util.Scanner;

public class HasJava {
	public static void main(String[] args) {
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    /*
	     Given a string word, print true if "java" appears 
	     starting at index 0 or 1 in the string, such as 
	     with "javaxxx" or "xjavaxx" but not "xxjavaxx". 
	     The string may be any length, including 0word = . 
	     */
	    
	//    word = ""+word.charAt(0);
	//    String word2 = word.substring(1, 2);
	    int beginIndex = 0;
	    int endIndex = word.length()-1;
		
	    if (word.length()-1 <= 1) {
	    	System.out.println(exists);
	    }
	    else if(word.substring(0,1).contains("j") || word.substring(beginIndex+1, 2).contains("j")) {
			System.out.println(!exists);
		}	   
	   else {
		   System.out.println(exists);
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
