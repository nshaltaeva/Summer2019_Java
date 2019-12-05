package day26_ForEach;

import java.util.Arrays;

public class ForEach_MultiD {
public static void main(String[] args) {
	
	/*
	 n dimensional array contains multiple (n-1) dimensional arrays
	 */
	
	int [] arr1D = {1,2,3,4};
	
	int [][] arr2D = {{1,2,3,4},{5,6,7,8,9}};
	
	//simple for loop
	for(int i=0; i<arr2D.length;i++) {
		//          counts the 1D arrays
		for (int j=0; j<arr2D[i].length; j++) {
			System.out.print(arr2D[i][j]+", ");
		}
		
	}
	System.out.println();
	
	//for each loop: reduce number of [] by one
	
	for (int [] each1: arr2D ) {
		for(int each2:each1) {
			System.out.print(each2+" ");
		}
	}
	System.out.println();
	
	String [][] str2D = {{"Bibish", "Nurzat"}, {"Madina", "Denis"}};
	//1st
	for(String[] each1DArrays: str2D) {
		for(String eachValue: each1DArrays) {
			System.out.print(eachValue+" ");
		}System.out.println();
	}
	//2nd
	for(String[] each1DArrays: str2D) {
		System.out.println(Arrays.toString(each1DArrays));
	}
	
	
	
	//3D
	int [][][] num3D = {  {{1,2},{3,4}},     {{5,6},{7,8}}          };
	
	for (int [][] each2DArray: num3D) {
		for(int[] each1DArray: each2DArray) {
			for(int eachValue: each1DArray) {
				System.out.print(eachValue+" ");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
