package ReplIt;

import java.util.Scanner;

public class Middle {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 String word = scan.next();
		    //YOUR CODE HERE
		//String word = "nut";
		 int length = word.length();
		
		/* 	 	 
		if(length%2 == 1 || length <= 3) {
			 System.out.println(word.charAt(length/2));
		 }	
		
		 else if (length%2 == 0 || length <= 4)  {
			 System.out.println(word.substring((length/2)-1, (length/2)+1));
		 } 
		  
		 */
	/*	if (length == 1) {
		for ( int i=1; i<=3; i++) {
			 System.out.print(word);
		}
		System.out.println();
		}
		else {
		for ( int i=1; i<3; i++) {
			 System.out.print(word);
		}
		System.out.println();
		} */
		
		if (word.length() >=3 && word.length() % 2 == 1){
		      int a = word.length()/2 ;
		      System.out.println(word.charAt(a));
		    }else if (word.length()==1 ) {
		      System.out.println(word+word+word);
		    } else if (word.length() >= 4 && word.length() % 2 == 0){
		      int b = word.length()/2 ;
		      System.out.println(word.substring(b-1,b+1));
		    } else if(word.length()==2){
		      System.out.println(word+word);
		    }
		
		
		
		
		
	}

}
