package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_print_FirstAndLast2 {
public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	  
	   
	    //TODO: Write your code below
	   
	    
	   
	    String result = "";
		for(int i=0; i <= words.length-1; i++) {
			result += words[i].substring(0, 1) + words[i].substring(words[i].length()-1)+", ";
		}
		result = result.trim();
		result = result.substring(0,result.lastIndexOf(","));
		System.out.println("["+result+"]");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  }
}
