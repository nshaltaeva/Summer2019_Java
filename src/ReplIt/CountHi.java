package ReplIt;

import java.util.Scanner;

public class CountHi {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    String  hi = "hi";
	    int count;
	    
	    count = (str.length() - str.replace(hi, "").length()) / hi.length();
	    System.out.println(count);
	    
	  }
}
