package ReplIt;

import java.util.Scanner;

public class SMS_Message {
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String message = scan.nextLine();
		      String sender=message.substring(message.indexOf("<")+1,message.indexOf(">"));
			    String phoneNumber=message.substring(message.indexOf("[")+1,message.indexOf("]"));
			    String messageBody=message.substring(message.indexOf("{")+1,message.indexOf("}"));
			    
			    System.out.println("Sender: "+sender+ "\n"+"Phone Number: "+phoneNumber+"\n"+"Message body: "+messageBody);
			    

		    /*
			second Way
		    System.out.println("Sender: "+message.substring(message.indexOf("<")+1,message.indexOf(">")));
			  System.out.println("Phone Number: "+message.substring(message.indexOf("[")+1,message.lastIndexOf("]")));
			  System.out.println("Message body: "+message.substring(message.indexOf("{")+1,message.indexOf("}")));	
		    */
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
