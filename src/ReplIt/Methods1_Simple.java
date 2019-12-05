package ReplIt;

import java.util.Scanner;

public class Methods1_Simple {
	public static void main(String[] args) {
	      
	      plus();
	  }
	  
	  public static void plus(){
	    //your code here
		  Scanner scan = new Scanner(System.in);
	      int a = scan.nextInt();
	      int b = scan.nextInt();
	    int sum = a+b;
	    System.out.println("result: "+ sum);
	  }
	  

}
