package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class Method_MergeArrays {
	 public static int[] mergR(int[] a,int[] b) {
		 int length =  a.length + b.length;
		 int length1[] = new int[length];
		 int z=0;
		 for(int i=0; i<a.length;i++) {
			 length1[z] = a[i];
			 z++;
		 }
		 for(int i=0; i<b.length;i++) {
			 length1[z] = b[i];
			 z++;
		 } 
	//	System.out.println(length1);
		 return length1;    
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
		  Scanner input = new Scanner(System.in);
		  int size = input.nextInt();
		 int[] a = new int[size];
		 int[] b = new int[size];
			for(int i = 0; i < a.length;  i++) {
			   a[i] = input.nextInt();
			   }
			for(int i = 0; i < b.length;  i++) {
			   b[i] = input.nextInt();
			   }	
		
			    int Merge[] = mergR(a, b);
	   System.out.println(Arrays.toString(Merge));
	  }
}
