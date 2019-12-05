package ReplIt;

import java.util.Scanner;

public class Method_IsEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		boolean result = isEven(n);
		System.out.println(result);
	}
	
	 public static boolean isEven(int n)
	  {
	    return (n%2 == 0)?true:false;
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
