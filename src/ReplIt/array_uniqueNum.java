package ReplIt;

import java.util.Scanner;

public class array_uniqueNum {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    
	   for(int j=0; j <nums.length; j++) {
	    int uniqNum = 0;
	    for(int i=0; i < nums.length; i++) {
	    	if(nums[i] == nums[j]) {
	    		uniqNum++;
	    	}
	    }
	   if (uniqNum == 1) {
		   System.out.println(nums[j]);
	   }
	    
	   } 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  }

}
