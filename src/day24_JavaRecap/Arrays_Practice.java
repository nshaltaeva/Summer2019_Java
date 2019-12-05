package day24_JavaRecap;

import java.util.Scanner;

public class Arrays_Practice {
	public static void main(String[] args) {
		 /*
		  ask user to enter 5 num and find the sum of those nums
		  must use arrays
		  */
		
		int [] num = new int [5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=num.length-1; i >=0 ; i--) {
			System.out.println("Enter a num");
			num[i] = scan.nextInt();
		}
		for(int i=0; i < num.length; i++) {
            System.out.print(num[i]+" ");
    }
		System.out.println();
		int sum =0;
		for(int i=0; i < num.length; i++) {
			sum += num[i];
		}
	System.out.println("Sum is: "+ sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
