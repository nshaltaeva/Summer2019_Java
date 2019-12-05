package ReplIt;

import java.util.Scanner;

public class Method_At3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String target = scan.next();
		String word = scan.next();
		
		
		System.out.println(at3(target, word));
	}
		
	
	public static String at3(String target,String word)
	  {
		String at3 = target.substring(0, 3);
	    String atRest = target.substring(3, target.length());
	    String Result = at3+ word+ atRest;
	    return Result;
	  }
}
