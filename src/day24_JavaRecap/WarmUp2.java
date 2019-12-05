package day24_JavaRecap;

public class WarmUp2 {
	public static void main(String[] args) {
		
		/*
		  1.  write a program that can return the minimum value from
		 an int array
		 
		 2. write a program that can return the second maximum 
		 value from an int array
		 */
		//task1
		int[] arr =  {50, 30, 6, -3, 20, 1};
		int min = 99999999;
		
		for(int i=0; i<arr.length; i++ ) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min num is: "+min);
		
		//task2
       int secondMin = 99999999;
		
		for(int j=0; j<arr.length; j++ ) {
			if(arr[j] < secondMin && arr[j] > min) {
				secondMin = arr[j];
			}
		}
		System.out.println("Second min num is: "+secondMin);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
