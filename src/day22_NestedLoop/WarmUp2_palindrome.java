package day22_NestedLoop;

import java.util.Scanner;

public class WarmUp2_palindrome {
	public static void main(String[] args) {
		
		/*
		  2. write a program that can check if the String is palindrome. 
	  if it's print "true", otherwise print "false"    DO NOT USE FOR LOOP
        Ex: input: level
            output: true,  (because reversed value is still "level"
            
            org      rev
            abba ==> abba      ==> palindrome
            level ==> level
		 */
		
	//	String original = " ey edip adanada pide ye ".trim();
		String original = " nursesrun ".trim();
		// index:          01234
		// reverse:        43210
		String reverse = ""; //level
		
		/*for(int i=original.length()-1; i >= 0;i--) {
			reverse += original.substring(i, i+1);
		}
		*/ //for loop
		
		//while loop solution
		
		int i = original.length()-1;
		while (i >= 0) {
			reverse += original.substring(i, i+1);
			i--;
		}
				
		boolean result = original.equals(reverse) ? true : false;
		System.out.println(result);
		
		//solution with Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter something");
		String original1 = scan.nextLine();
        String reverse1 = ""; //level
		
		for(int i1=original1.length()-1; i1 >= 0;i1--) {
		//	reverse1 += original1.substring(i, i+1); //with substring
			reverse1 += original1.charAt(i1); //with charAt
		}
		boolean result1 = original1.equals(reverse1) ? true : false;
		System.out.println(result1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
