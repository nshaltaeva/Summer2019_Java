package day26_ForEach;

import java.util.Arrays;

public class ForEachLoop {
	/*
	 for each loop: used to access the value in a collection of values,
	 it's a loop that's already been iterated. For each loop can Never
	 be infinite.
	 
	  syntax of For each loop:
	  for(DataType each: ArrayName{
	  }
	 */
public static void main(String[] args) {
	
	int [] arr = {1,2,3,4,5};
	for(int i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("====================");
	
	for(int each: arr) {
		System.out.println(each);
	}
	System.out.println("====================");
	
	
	String [] str = {"a","b","c"};
	
	for(String peach: str) {
		System.out.print(peach+" ");
	}
	System.out.println();
	System.out.println("=====================");
	
	//sort and print 
	char[] ch = {'z','x','y','c','b','a'};
	Arrays.sort(ch);
	
	for(char each: ch) {
		System.out.print(each+" ");
	}
	System.out.println();
	System.out.println("==========================");
	
	//find even numbers and print them
	int [] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	for(int varName: arr1) {
		if (varName %2 == 0) {
			System.out.print(varName+", ");
		}
		
	}
	
	//print out 1~1000: we cannot use for each loop
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
