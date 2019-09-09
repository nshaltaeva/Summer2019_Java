package day16_Recap;

import java.util.Scanner;

/* 
 write a program to print 
 */
public class WarmUp {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name and last name");
		String FName = scan.nextLine().toUpperCase(),
			   LName = scan.nextLine().toUpperCase();
		
		String fullname = LName+" "+FName;
//		fullname = fullname.toUpperCase();
 //      String fullname = FName.concat(" "+lastname).toUpperCase();
		System.out.println("Your full name is: "+fullname);
		
		
	}

}
