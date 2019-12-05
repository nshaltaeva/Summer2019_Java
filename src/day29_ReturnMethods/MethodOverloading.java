package day29_ReturnMethods;

import java.util.Arrays;

public class MethodOverloading {
	
	public static void main(String[] args) {
		int result =sum(10, 20, 30);
		int result2 = sum(8, 40);
		System.out.println(result);
		
	System.out.println(result2);
	
	double result3 = sum(1, 2, 3, 4);
	System.out.println(result3);
		
	double result4 = sum(2, 4);
	System.out.println(result4);
	
	//overload method example: the sort methods of Arrays
	// Arrays.sort();
	
	int [] arr = {1,2,3,4,5};
	Sort(arr);
	
	char [] ch = {'a','b','c'};
	Sort(ch);
	
	String [] str = {"xmen","yogurt","zebra","zoo"};
	Sort(str);
	
	
		
	}
	
	
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, long b, int c) {
		return a+(int)b+c;
	}
	
	public static double sum(int a, int b, int c, int d) {//parameters must be different
		return a+b+c+d;
	}
	
	public static double sum(double a, double b) {
		return a+b;
	}
	
	//write a method called sort, that can sort in descending order
	
	public static void Sort (int[] arr) {
		Arrays.sort(arr);
		
		for(int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
	}
	
	public static void Sort (char[] arr) {
		Arrays.sort(arr);
		
		for(int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void Sort (String[] arr) {
		Arrays.sort(arr);
		
		for(int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
