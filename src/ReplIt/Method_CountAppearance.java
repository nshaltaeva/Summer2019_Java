package ReplIt;

import java.util.Scanner;

public class Method_CountAppearance {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sizeOfArray = scan.nextInt();
		String [] str = new String [sizeOfArray];
		for(int i=0; i < sizeOfArray; i++){
		      str[i] = scan.next();
		    }
		String t= scan.next();
		
		int count = count_appearance(str, t);
		 System.out.println(count);
		
	}
	public static int  count_appearance(String[] arr,String t) {
		
		int count =0;
		   for(int i=0; i<arr.length;i++) {
			   if(arr[i].equals(t)) {
				   count++;
			   }
		   }
		  //   System.out.println(count);
		
		return count;
	}
	  
	   
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
