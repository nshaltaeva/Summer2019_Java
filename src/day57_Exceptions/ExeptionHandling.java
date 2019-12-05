package day57_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ExeptionHandling {
	
	public static void main(String[] args) {
		
		
		int [] number = {100,200,300};
		
		try {
			System.out.println(number[2]);
			System.out.println("Try block, Checked exception");
		} catch (ArrayIndexOutOfBoundsException anyname) {
			System.out.println("Catch block, Unchecked exception");
		}
		
		
		System.out.println("=======================================");
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("Work Done");
		
		

        ArrayList<Integer> list =new ArrayList<Integer>();
            list.addAll(Arrays.asList(1,2,3));
            
            try {
                
            System.out.println(list.get(10 ));
            System.out.println("checked Exception occured in arraylist");
            
            } catch(RuntimeException e) {  
                System.out.println("unchecked Exception occured in arraylist");
            }  
            
            // parent exception class can handle child class' exceptions
        
            
            
        /*  
            try {
            Thread.sleep(100);
            
            } catch(RuntimeException e) {
                
            }
        
        */
        
            try {
                
            Thread.sleep(2000);
            
            } catch(Exception e) {
                
            }
            
            
            int[] nums = {1,2,3};
            
            int a;
            
            try {
                a= 100;
                System.out.println(nums[10]);
                
            }catch (Exception e) {
                System.out.println("Checked exception");
            }
            
            
            
            
            
            
            
            
            
            
            System.out.println("Done");
        
    }
    
    public static void method(String kfc) {
        
    }
    
    
		
		
	

}
