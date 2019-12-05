package ReplIt;

import java.util.Scanner;

public class arrays_calculate_evenNums {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: Write your code below
	    
	    int count =0;
	    for(int i=0; i < nums.length; i++) {
	    	if(nums[i] % 2 ==0) {
	    		count++;
	    	}
	    }System.out.println(count);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  }
}
