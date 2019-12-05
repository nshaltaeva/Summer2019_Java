package ReplIt;

import java.util.Scanner;

public class Method_C_Profits {
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	int buyPrice = scan.nextInt();
	int sellPrice = scan.nextInt();
	
	String profit = c_profits(buyPrice,sellPrice);
	System.out.println(profit);
	}
	
	public static String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
	  
	   if (buyPrice < sellPrice)
		   return "profit";
	   else if (buyPrice > sellPrice)
		   return "loss";
	   else
		   return "no loss";
	   
	
	  }

}
