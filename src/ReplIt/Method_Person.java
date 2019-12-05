package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Person {
	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		  }
		  
		   public static void person(String info) 
			{
			//your code here
			String [] str = info.split(",");
System.out.println("person name: "+str[0]+" "+"last name: "+str[1] +" "+"age: "+str[2]);   
			
			}//end person
		  

}
