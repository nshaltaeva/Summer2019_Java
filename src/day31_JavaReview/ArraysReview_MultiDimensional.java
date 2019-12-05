package day31_JavaReview;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview_MultiDimensional {
	
	public static void main(String[] args) {
		
		
		int[] arr1D = {1,2,3};
		
	//   index:            0 1 2    0 1 2	
		int [][] arr2D = {{1,2,3}, {4,5,6}};
	//	index:				0         1
		
	System.out.println(arr2D.length);	
		
		
	//print 2:
	System.out.println(arr2D[0][1]);
		
	//print	{4,5,6}
	System.out.println(Arrays.toString(arr2D[1]));	
		
	//print {{1,2,3}, {4,5,6}};
	System.out.println(arr2D);	//hash code
	System.out.println(Arrays.toString(arr2D));	//hash code
	
	//Arrays.deepToString(arr2D): converts multi_dimensial arrays to String
	String str = Arrays.deepToString(arr2D);
	System.out.println(str);	
		
		
	char[] ch = {'a','b','c','d','c','e'};
	for(char each: ch) {
		
		if(each == 'c') {
			continue;
		}
		System.out.print(each+" ");
	}
	System.out.println();
	
	
	String [][] names = {  {"Erhan","Holy","Denis", "John Snow", "tarzan"}  ,  {"Muhtar","Mike","Ariya"}};
	//int count=0;
	for(String[] each1D: names) {
		for(String eachValue: each1D) {
			if(eachValue.equals("Holy") || eachValue.equals("John Snow")) {
				continue;
				
			}
			System.out.println(eachValue);
		}
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
