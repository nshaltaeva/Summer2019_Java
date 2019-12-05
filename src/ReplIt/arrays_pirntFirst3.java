package ReplIt;

import java.util.Scanner;

public class arrays_pirntFirst3 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	String[] arr = new String[5];
	for (int i=0;i<5;i++)
	{
		arr[i] = input.nextLine();
	}
	//leave above alone!  write your code below. 
	//Create another loop for your solution!
	
	for(int i=0; i<arr.length;i++) {
		int length = arr[i].length();
		if (length >= 3) {	
		System.out.print(arr[i].substring(0,3));
		
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
