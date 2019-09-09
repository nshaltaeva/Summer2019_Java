package day10_Ifstatement;

public class Without_CurlyBrace {
	
	public static void main(String[] args) {
		
		/*
		 single if statement:
		 if (condition) {
		         //some code
		 }
		 */
		
		if (false) {
			System.out.println("Today is Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("There is no Java class tomorrow");
		}
		
		if (false)
			System.out.println("today is Friday");

		System.out.println("Tomorrow there is no class");
		
		/*
		  if (condition)
		  //only one line of statement
		   else 
		   //only one line of staetment
		 */
		
		if (false)
			System.out.println("this is 'if'");
		else 
		    System.out.println("this is 'else'");
		
		
		/*
		 else if statement
		 */
		
		if (true)
			System.out.println("if block");
		else if (true)
			System.out.println("else-if block");
		else 
			System.out.println("else block");
		//else block is not mandatory
		
		
	}

}
