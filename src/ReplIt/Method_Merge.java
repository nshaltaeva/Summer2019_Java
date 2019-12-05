package ReplIt;

import java.util.Scanner;

public class Method_Merge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String one = scan.next();
		String two = scan.next();
		
		String result = mergeStrings(one, two);
		System.out.println(result);
	}
	public static String mergeStrings(String one, String two) {
	    
		
		int bigLength = one.length()>two.length()?one.length():two.length();
		String result = "";
		for(int i = 0; i<bigLength; i++){
		if(i<one.length())
		   result += one.charAt(i);
		if(i<two.length())
		   result += two.charAt(i);
		}
	    
		return result;
	  }
	

}
