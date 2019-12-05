package day27_CustomMethods;

import java.util.Arrays;

public class Warmup {
	public static void main(String[] args) {
		
		
		/*
		 1. create an int array called numbers that has length of 100
		 2. assign 1~100 to the array' each indexes
		 3. use for each loop to print out all even numbers
		 use "continue"
		 */
		
		int [] numbers;
		numbers = new int [100];
		
		for (int i=1; i<=100;i++) {
			numbers[i-1] =i;
			//if i=0; numbers [i] = i+1;
			//each value of "i" will be assigned to the index number os 
		}
		
		System.out.println(Arrays.toString(numbers));
		
		for(int each: numbers) {
			if(each%2 != 0) {
				continue;
			}
			System.out.print(each+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
