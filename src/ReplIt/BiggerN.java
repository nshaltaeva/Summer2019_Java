package ReplIt;

import java.util.Scanner;

public class BiggerN {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n1");
		int n1 = scan.nextInt();
		System.out.println("Enter n2");
		int n2 = scan.nextInt();
		System.out.println("Enter n3");
		int n3 = scan.nextInt();
		int max = 0;
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is bigger");}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("n2 is bigger");}
		else {
			System.out.println("n3 is bigger");
		}
		
		
		
		
		
		
		
		
		
	}

}
