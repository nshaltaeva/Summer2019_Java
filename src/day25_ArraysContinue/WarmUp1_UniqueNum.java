package day25_ArraysContinue;

import java.util.Scanner;

public class WarmUp1_UniqueNum {
	public static void main(String[] args) {
		
		/*
		 1. write a program that can print out the unique values from
		 array an int Array
		 ex:
		 if arr -> {1,1,2,3,3}
		 output: 2
		 if arr -> {1,2,2,3,4,4}
		 output: 1,3
		 
		
		 */
		
		int [] arr = {1,1,1,2,2,2,2,2,2,3,4,4,9,7,7,6,5};
		
		for(int j =0; j<arr.length;j++) {
		int count=0;//to find how many time a value is appeared in the array
		for (int i =0; i < arr.length; i++) {
			if(arr[i] == arr[j]) {//compares each index of the array with the given value 
				count++;//everytime if the value is occured in the array, count will be increased by one
			}
		}		
		if(count == 1) {//if only appeared once, we will print that value out
			System.out.print(arr[j]+" ");
		}
		}
		System.out.println();
		
		
		
		
		/*
		  2. write a program that can print out the unique values from
		 String Array
		 */
       String[] arr1 = {"x", "x", "z", "y"};
		
		for(int k =0; k<arr1.length;k++) {
		int count=0;
		for (int h =0; h < arr1.length; h++) {
			if(arr1[h].equals(arr1[k])) {
				count++;
			}
		}		
		if(count == 1) {
			System.out.print(arr1[k]+" ");
		}
		}
		
		
		
		
		
		
		
		
		
	}

}
