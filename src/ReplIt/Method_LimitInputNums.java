package ReplIt;

import java.util.Scanner;

public class Method_LimitInputNums {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		int maxLength = scan.nextInt();
		
		System.out.println(limit(text, maxLength));
		
		
	}
	
	
	
	public static String limit(String text, int maxLength) {
	    
		text = text.substring(0,maxLength);
				
		return text;
	  }
	
	

}
