package ReplIt;

import java.util.Scanner;

public class Method_WaterTax {
	
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double units = scan.nextDouble();
		
		double waterTax = waterTax(units);
		System.out.println(waterTax);
		
		}
		
	public static double waterTax(double units)
	  {
	    double bill = 0.0;
	    
	    //your code here
	    
	    if (units <= 50)
	       bill = units*0.60;
	    else if (units >= 51 && units <= 100)
	    	bill = units*0.90;
	    else if (units >= 101 && units <= 150)
	    	bill = units*0.90 + 50;
	    else
	    	bill = units*0.90 + 100;
	    //end your code here
	    
	    
	    return bill;
	  }//end waterTax

}
