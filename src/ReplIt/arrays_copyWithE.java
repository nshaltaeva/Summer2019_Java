package ReplIt;

import java.util.*;

public class arrays_copyWithE {
	public static void main(String[] args) {
	    System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
	   
	  String  result ="";
	   for(int i=0; i < arr.length; i++) {
		   if (arr[i].contains("e")) {
			   result += arr[i]+" ";
		   }
	   }
	   result = result.trim();
//	   result = result.substring(0, result.length()-1);
	   
	   String [] fewValues = result.split(" ");
	    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	  }
	  
	  
}
