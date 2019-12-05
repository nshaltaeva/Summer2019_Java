package ReplIt;

import java.util.Scanner;

public class arrays_split_email {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    //Write your code below
	    
	//    String [] splitEmail = email.split(" ");
	   
	    
	    if ( ! email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")) {
	    	System.out.println("invalid email");
	    }
	    else {
	    String EmailId = email.substring(0, email.indexOf("@"));
		System.out.println("Email id: "+EmailId);
	    
	    String domain = email.substring(email.indexOf("@")+1, email.length());
	    System.out.println("Email domain: "+domain);
	    
	    
	     /*String[] split= email.split("@");
      		System.out.println("Email id: " + split[0] +
                          "\nEmail domain: " + split[1]);
	     */
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	  }
}
