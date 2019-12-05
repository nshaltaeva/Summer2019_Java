package ReplIt;

import java.util.Scanner;

public class Method_ReturnXandMax {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter x");
	int x = scan.nextInt();
	System.out.println("Enter max");
	int max = scan.nextInt();
	
	
	int m = max(x, max);
	
	 System.out.println(m);
	
	
	}
	
	public static int max(int x,int  max)
	  {
		int m =0;
    if (x > max) {
     m += max;
    }
    else  {
		
		m += x;
	}
		
		return m;
	  }
	  
	  
}
