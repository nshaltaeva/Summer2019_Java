package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_print_FirstAndLast {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	  
	   
	    //TODO: Write your code below
	
	    for(int i=0; i<words.length;i++) {
		   	System.out.print(words[i].substring(0, 1) + words[i].substring(words[i].length()-1)+" ");
		    }
	    System.out.println();
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  }
}
