package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_reverse_order {
	public static void main(String[] args) {
		/*
		 Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example: sentence -> "Java is fun"
Print
fun
is
Java
		 */
		
		
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //TODO: Type your code below
	    
	    
		
		String reversed = "";
	    //TODO: start your code here
		
		String [] array = sentence.split(" ");
	      
		for(int i = array.length-1; i >= 0; i--) {
		reversed += array[i]+" ";
		
		}
	    
	    
	    //End your code here. do not modify below statement
	    System.out.println(reversed.trim());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
