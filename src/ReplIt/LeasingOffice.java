package ReplIt;

import java.util.*;

public class LeasingOffice {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Welcome to Cybertek Apartments!");
	    System.out.println("Number of bedrooms you are interested:");
	    int numberOfBedrooms = scan.nextInt();
	    int startingPrice=0;
	    int startingPrice1 = 1100;
	    int startingPrice2 = 1850;
	    int startingPrice3 = 2550;
	    
	    if (numberOfBedrooms == 1) {
	    	System.out.println("One Bedroom Selected");
	    	System.out.println("Starting Price: "+ startingPrice1);
	    }else if (numberOfBedrooms == 2) {
	    	System.out.println("Two Bedroom Selected");
	    	System.out.println("Starting Price: "+ startingPrice2);
	    }else if (numberOfBedrooms == 3){
	    	System.out.println("Three Bedroom Selected");
	    	System.out.println("Starting Price: "+ startingPrice3);
	    }else {
	    	System.out.println("No such Bedrooms available");
	    	System.out.println("Starting Price: "+ startingPrice);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
