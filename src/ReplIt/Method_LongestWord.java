package ReplIt;

import java.util.Scanner;

public class Method_LongestWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		
		
		System.out.println(biggerS(a, b));
	}
  public static String biggerS(String a ,String b)
  {
   return (a.length()>b.length())?a:b;
	
	 
  // return bigger;
  }
}
