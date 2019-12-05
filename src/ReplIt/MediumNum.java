package ReplIt;

import java.util.Scanner;

public class MediumNum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scan.nextInt();
		System.out.println("Enter second number:");
		int b = scan.nextInt();
		System.out.println("Enter third number:");
		int c = scan.nextInt();
		
	//	int a = 10, b = 15, c = 13;
				
				
				int middle = (a <= b) 
				    ? ((b <= c) ? b : ((a < c) ? c : a)) 
				    : ((a <= c) ? a : ((b < c) ? c : b));
		
		System.out.println("Medium value is: "+middle);
		
		if( b>a && a>c || c>a && a>b )
		{
		    System.out.println(a+"a is middle number");
		}

		//Checking for b is middle number or not
		if( a>b && b>c || c>b && b>a )
		{
			System.out.println(b+"b is middle number");
		}

		//Checking for c is middle number or not
		if( a>c && c>b || b>c && c>a )
		{
			System.out.println(c+"c is middle number");
		}
		
		if(a>b)
		{
		    if(b>c)
		    {
		    	System.out.println(b+"b is middle one");
		    }
		    else if(c>a)
		    {
		    	System.out.println(a+"a is middle one");
		    }
		    else
		    {
		    	System.out.println(c+"c is middle one");
		    }
		}
		else
		{
		    if(b<c)
		    {
		    	System.out.println(b+ "b is middle one");
		    }
		    else if(c<a)
		    {
		    	System.out.println(a +"a is middle one");
		    }
		    else
		    {
		    	System.out.println(c+ "c is middle one");
		    }
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
