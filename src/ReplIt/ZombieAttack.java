package ReplIt;

import java.util.Scanner;

public class ZombieAttack {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter amount of inhabitants");
	    int inhabitants = scan.nextInt();
	    
	
	    
	    int dayCounter =0;
	     do {
	    	if(inhabitants > 0) {
	    	System.out.println("Day "+ dayCounter+ " ["+inhabitants+"]");
	    	dayCounter++;
	    	    		
	    		inhabitants /= 2;
	    	}
	    		if(inhabitants == 0) {
	    			 System.out.println("---- EXTINCT ----");	
	    			 break;
	    		}
	    	
	    }while (inhabitants >= 0);
	   
	 
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  }
}
