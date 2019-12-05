package day33_ArrayList_MethodCalls;

import java.util.Arrays;

public class WarmUp_DescendingOrder {
/*
 Warm up:
    write a return method that accepts an int array and sorts it in descending order
    write a return method that accepts a double array and sorts it in descending order
    write a return method that accepts a char array and sorts it in descending order
    write a return method that accepts a String array and sorts it in descending order
        Hint: method overloading is preferred here
 */
	public static void main(String[] args) {
		int [] arr = {10,89,20,300,10,900,0,1};
		arr = SortDes(arr);
		System.out.println(Arrays.toString(arr));
		
		double [] arrD = {10.5, 5.5 , 300, 2.0, 6.5};
		arrD = SortDes(arrD);
		System.out.println(Arrays.toString(arrD));
		
		char[] ch = {'c', 'a', 'b', 'z', 'x', 'k'};
		ch=SortDes(ch);
		System.out.println(Arrays.toString(ch));
		
		String [] names = {"Mikray", "Jin", "Minever", "Nurzat", "Victoria","Erhan"};
		names = SortDes(names);
		System.out.println(Arrays.toString(names));
	}
	
	//task 1
	public static int [] SortDes(int [] arr) {
		Arrays.sort(arr);
		int[] arr2 = new int[arr.length];// can contain all values of arr
		int j=0;
		for(int i=arr.length-1; i>=0; i--) {
			arr2[j] = arr[i]; 
	//		arr2[arr.length-1-i] = arr[i]; another solution without using int j
			j++;
		}
		
		return arr2;
		}
	
	//task 2
		public static double [] SortDes(double [] arr) {
			Arrays.sort(arr);
			double[] arr2 = new double[arr.length];// can contain all values of arr
			int j=0;
			for(int i=arr.length-1; i>=0; i--) {
				arr2[j] = arr[i]; 
		//		arr2[arr.length-1-i] = arr[i]; another solution without using int j
				j++;
			}
			
			return arr2;
			}
	
		//task 3
				public static char [] SortDes(char [] arr) {
					Arrays.sort(arr);
					char[] arr2 = new char[arr.length];// can contain all values of arr
					int j=0;
					for(int i=arr.length-1; i>=0; i--) {
						arr2[j] = arr[i]; 
				//		arr2[arr.length-1-i] = arr[i]; another solution without using int j
						j++;
					}
					
					return arr2;
					}
	
				//task 4
				public static String [] SortDes(String [] arr) {
					Arrays.sort(arr);
					String[] arr2 = new String[arr.length];// can contain all values of arr
					int j=0;
					for(int i=arr.length-1; i>=0; i--) {
						arr2[j] = arr[i]; 
				//		arr2[arr.length-1-i] = arr[i]; another solution without using int j
						j++;
					}
					
					return arr2;
					}
	
				//task with Wrapper class
				public static Integer [] SortDes(Integer [] arr) {
					Arrays.sort(arr);
					Integer[] arr2 = new Integer[arr.length];// can contain all values of arr
					int j=0;
					for(int i=arr.length-1; i>=0; i--) {
						arr2[j] = arr[i]; 
				//		arr2[arr.length-1-i] = arr[i]; another solution without using int j
						j++;
					}
					
					return arr2;
					}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
