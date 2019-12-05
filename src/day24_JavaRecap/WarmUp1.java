package day24_JavaRecap;

public class WarmUp1 {
	public static void main(String[] args) {
		
		/*
		 1. write a program that can return the maximum value from
		 an int array
		 
		 2. write a program that can return the second maximum 
		 value from an int array
		 
		
		 */
		//task 1
		int[] arr = {20, 80,50, 70,54,78};
		
		int max = 0;
		
		for(int i=0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum num is: "+max);
		
		//task 2
		int secondMax = 0;
		for(int j=0; j <arr.length; j++) {
			if(arr[j]>secondMax && arr[j] != max) {
				secondMax = arr[j];
			}
		}
		System.out.println("Second max number: "+secondMax);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
