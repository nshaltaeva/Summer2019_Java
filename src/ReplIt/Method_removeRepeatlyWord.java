package ReplIt;

import java.util.Scanner;

public class Method_removeRepeatlyWord {
	 
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String badWord = scan.next();
		
		
		System.out.println(clean(text, badWord));
		
		
	}
	
	public static String clean (String text ,String badWord) {
	
		String clean = "";
		if (text.contains(badWord))
			clean =  text.replace(badWord, "");
		
	    
		return clean;
	  }
}
