package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_swap {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    int temp =0;
	    int firstIndex = 0;
	    int lastIndex = nums.length-1;
	    int middleIndex = nums.length/2;
	    
	    
	    for(int i = 0; i < nums.length; i++) {
	    
	    temp = nums[firstIndex];
	    nums[firstIndex] = nums[lastIndex];
	    nums[lastIndex] = temp;
	   	 
	    int temp2 = nums[firstIndex+1];
	    nums[firstIndex+1] = nums[lastIndex-1];
	    nums[lastIndex-1] = temp2;
	  
	    int temp3 = nums[middleIndex-1];
	    nums[middleIndex-1] = nums[middleIndex+1];
	    nums[middleIndex+1] = temp3;
	    
	    }
	    
	    
	    //Do not change below statement:
	    System.out.println(Arrays.toString(nums));
	    
	  }
}
