package ReplIt;

import java.util.Scanner;

public class arrays_shortest_word {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};

		  
	    String myShort = str[0]; //assign it to the first word for now.
		   
		    	
		    for(String Shortest : str)
		    {
		    if(Shortest.length() < myShort.length())
		    myShort = Shortest;
		    }

		    System.out.println(myShort);
	    
	  }

}
