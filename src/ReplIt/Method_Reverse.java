package ReplIt;

import java.util.Scanner;

public class Method_Reverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		System.out.println(reverse(word));
	}
	
	
	public static String reverse(String input)
	{
	   String reverse = "";
	   for(int i=input.length()-1; i>=0; i--) {
		   reverse += input.charAt(i);
	   }
	   return reverse;
	}
}
