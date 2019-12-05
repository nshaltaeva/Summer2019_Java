package ReplIt;

import java.util.Scanner;

public class Merge {
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //YOUR CODE HERE
		  //solution 1  
		    if (word1.length() == 3 && word2.length() == 3) {
String word3 =	word1.substring(0, 1)+word2.substring(0, 1)+word1.substring(1, 2)+word2.substring(1, 2)+word1.substring(2, 3)+word2.substring(2, 3);
            System.out.println(word3);
		    }
		    else {
		    	System.out.println("cannot merge");
		    }
		//solution 2
		    if (word1.length() == 3 && word2.length() == 3) {
		String word4 = "";
		for(int i=0; i<word1.length() || i<word2.length();i++) {
			
		if (i<word1.length()) {
			word4 += word1.charAt(i);
		}
		if (i<word2.length())	{
			word4 += word2.charAt(i);
		}
				
		}
		System.out.println(word4);
		    } else {
		    	System.out.println("cannot merge");
		    }
		
		
		
		
		
		
		
		
		
		
	}

}
