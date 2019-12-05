package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_shortest_words {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    
	    String[] array = str.split(", ");
    
    String ShortestName = "";
		
		int min= Integer.MAX_VALUE;
		for(int i =0; i<array.length; i++) {
			if(array[i].length() <= min) {
				min = array[i].length();
				ShortestName = array[i];
			}
		}
	//	System.out.println(min);
	//	System.out.println(ShortestName);
	    
		String result = "";
		
	    for(int j=0; j < array.length;j++) {
	    	if(array[j].length() == ShortestName.length()) {
	    		result += array[j]+", ";
	    	}
	  	 }
	    String[] shortOnes = result.split(", ");
	    Arrays.sort(shortOnes);
	    System.out.println(Arrays.toString(shortOnes));
	    
	    
	    
	    
	    
	    
}
}
