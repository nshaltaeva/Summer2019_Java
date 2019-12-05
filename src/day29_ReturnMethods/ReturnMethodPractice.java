package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodPractice {
	public static void main(String[] args) {
		sum(10,20);
		
	//	int max = sum(10,20);// the method sum does not return any value
	 addition(10, 20);//this method is just int value
	 float add = addition(10,20);//implicit casting
	 System.out.println(add);
	 
	int max = (int)largest(90, 80, 10);// by casting; its gonna be reuslbe if we assign to a variable
	System.out.println(max);
	 
	
	int [] arr = {20,30,1,2,3,4,100};
	int maxNum = maximum(arr);
	System.out.println(maxNum);
	
	int[] arr2 = {1000,3000,6747,438723,888};
	int maxNum2 = maximum(arr2);
	System.out.println(maxNum2);
	
	
	
	String [] names = {"Nurzat", "Tugba", "Madina", "Mehmet", "Talha", "Mustafa"};
	
	String longName = longestWord(names);
	System.out.println(longName);
	
	
	int [] array = {1,2,3,4,5,6,7};
	array = sort(array);
	
	System.out.println(Arrays.toString(array));
	
	int[] array1 = {1,2,3,4,5,6,7};  // 7 6 5 4 3 2 1
    array1 = Sort(array1);
    System.out.println( Arrays.toString(array1) );
	
	}
	
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	public static int addition(int a, int b) { //it's need extra parameters
		return (a+b);
	}
	
	//write the method that accepts 3 nums and return the largest num
	
	public static double largest(int a, int b, int c) {
		int [] arr = {a,b,c};
		Arrays.sort(arr);
		
		return arr[arr.length-1];
	}
	
	//write a method that accepts an int array and returns the max num from the array
	
	public static int maximum (int [] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	//accepts String array and find the longest String value
	public static String longestWord(String[] array) {
		String longWord = "";
		int max = 0;
		for (int i=0; i < array.length; i++) {
			if (array[i].length() > max) {
				max = array[i].length();
				longWord = array[i];
			}
		}
		
		return longWord;
	}
	
	
	//write a method that accepts an int array and sorts it then return an array
	
	public static int[] sort (int[] arr) {
							// {5,3,7,22,3}
		Arrays.sort(arr); //{3,3,5,7,22}
		int [] numbers = new int[arr.length];//numbers array has same length with arr
		int z=0;
		for(int i = arr.length-1; i >= 0; i--) {
			numbers[z] = arr[i];
			z++;
		}
		return numbers;
	}
	
// write a method that accepts an int array and sorts it then retuns an array
    
    public static int[] Sort(int[] arr) {
                                //[5,3,2,22,3};
        Arrays.sort(arr);  //[2,3,3,5,22];
        int[] numbers = new int[arr.length]; // numbers array has same length with the arr
        
        int z =0;
        for(int i = arr.length-1; i >= 0; i--  ) {
                     numbers[z]= arr[i];
                     z++;
        }
        
        return numbers;
    }
	
	
	
	
	
	
	
	
	
	

}
