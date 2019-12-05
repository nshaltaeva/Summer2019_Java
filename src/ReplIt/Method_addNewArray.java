package ReplIt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Method_addNewArray {
	public static void add_to_r(int[] r,int n) 
	{
		//create new array with one more position.
		int[] new_r = new int [r.length+1]; //define new array bigger by 1
		//copy values into new array
		for(int i=0; i< r.length; i++) 
			new_r[i] = r[i];
		//add new value to the new array
			new_r[new_r.length-1] = n;
			
		    //copy the address to the old reference 
	        //the old array values will be deleted 
			r = new_r;
			
		System.out.println(Arrays.toString(r));
		
	}
  
  public static void main(String[] args) {
    
    
    Scanner inp = new Scanner(System.in);
    int size = inp.nextInt(),n = inp.nextInt();
    int[] arr = new int[size];
    for(int i=0 ;i<=size-1;i++)
    {

        arr[i]=inp.nextInt();
    }
    
     add_to_r(arr, n);
   
    
  }
}
