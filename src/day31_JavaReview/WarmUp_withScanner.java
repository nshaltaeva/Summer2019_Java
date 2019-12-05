package day31_JavaReview;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp_withScanner {

	public static void main(String[] args) {
		
	//ask user to enter 3 nums and find max an min nums
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to add?");
		int number = scan.nextInt();
		int [] arr = new int [number];
		
		for(int i=0; i<arr.length;i++){
		System.out.println("Enter a number: ");
			arr[i] = scan.nextInt();
		}
		
		
		/*
		System.out.println("Enter a number: ");
		arr[1] = scan.nextInt();
		
		System.out.println("Enter a number: ");
		arr[2] = scan.nextInt();
		*/
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("Maximum value: "+arr[0]);
		System.out.println("Minimum value: "+arr[arr.length-1]);
		
		
		
		
		
		
		
		
	}

}