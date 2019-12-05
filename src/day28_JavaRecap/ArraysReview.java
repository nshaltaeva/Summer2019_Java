package day28_JavaRecap;

import java.util.Arrays;

public class ArraysReview {
	public static void main(String[] args) {
		
		//int [] arr1D = new int[] {1,2,3,4};
		int [] arr1D = {1,2,3,4};
		//index:        0 1 2 3
		System.out.println(arr1D[2]); //3
		
		
		//initialize the size of 1D array: int [] arr = new int [length number]
		int [] arr = new int[3];//[0,0,0]
		//this array can contain three values
		   arr[1] = 10; //[0,10,0]
		   arr[0] = 30; //[30,10,0]
		   arr[2] = 40; //[30,10,40
	//	   arr[3] = 50; //Array,s size is fixed
		
		//to print the array: array need to be converted to String
		System.out.println(Arrays.toString(arr));
		
		
		//Continue (skipping) and break statements
		
		
		int [] nums = {10,20,30,40};
		
		for(int eachValue: nums) {
			if(eachValue == 20) {
				continue; //skips every single statements after the continue
			}
			System.out.print(eachValue+" "); //10
			break; //exits loop immediately
		}
		System.out.println();
		
		
		int[] nums1 = {100,200,300,400};
		for(int i=0; i<nums1.length;i++) {
			
			if(nums1[i] == 300) {
				break;
			}
			System.out.print(nums1[i]+" "); //100,200
			
		//	if(nums1[i] == 300) {
			//	break; //100 200 300
		//	}
		}
		System.out.println();
		/*
		 Arrays Util class:  toString() , sort(), deepToString()
		 	
		 		toString(): converting single dimensional array to String
		 		sort(): sorting single dimensional array in ascedning order
		 		deepToString(): converting Mulit-Dimensional array to String
		 
		 */
		
		//sort():
		long [] LongArray = {20,400,500,300,10,20};
		System.out.println(Arrays.toString(LongArray));
		
		Arrays.sort(LongArray);
		System.out.println(Arrays.toString(LongArray));
		
		//deepToString();
		int[][] arr2D = {{1,2}, {3,4}};
		//index:           0      1
		
		System.out.println(Arrays.toString(arr2D)); //array.toSting cannot convert multidimensional array
		
		System.out.println(Arrays.deepToString(arr2D));
		
		//print: {3,4}
		System.out.println(arr2D[1]);//needs to be converted to String //hashcode
		System.out.println(Arrays.toString(arr2D[1]));
		
		//print: 4
		
		System.out.println(arr2D[1][1]);
		
		
		//int[][] arr2D = {{1,2}, {3,4}};
		
		for(int[] each1DArray: arr2D) {
			for(int eachValue: each1DArray) {
				System.out.print(eachValue+" ");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
