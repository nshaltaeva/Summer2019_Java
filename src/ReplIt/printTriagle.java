package ReplIt;

import java.util.Scanner;

public class printTriagle {
	public static void main(String[] args) {
		
	//	int i = 1;
	//	int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
		int i =1;
		while (i <= n) {
			
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			
			System.out.println();
			
			i++;
		}
		
		
		
		
		
		
	}

}
