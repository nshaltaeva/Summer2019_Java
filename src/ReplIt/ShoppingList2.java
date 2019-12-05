package ReplIt;

import java.util.Scanner;

public class ShoppingList2 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String shoppingListReport = "";
	String item = "";
	String countinue = "";
	double price = 0;
	int count = 1;
	double totalPrice = 0;
	
	
	do{
		  System.out.println("Enter Item" +count + " and its price:" );
		  
		  item = scan.next();
		  price = scan.nextDouble();
		  
		  totalPrice += price;
		  shoppingListReport += "Item"+count+": "+item+" Price: " + price+", ";
		  
		  System.out.println("Add one more item?");
		  countinue = scan.next();
		  while(! (countinue.equals("yes") || countinue.equals("no"))){
			  System.out.println("You can answer Yes/No");
			  System.out.println("Add one more item?");
			  countinue = scan.next();
		    shoppingListReport += " ";
		  }
		  
		  count++;
		}while(countinue.equals("yes"));
	
shoppingListReport=shoppingListReport.substring(0, shoppingListReport.length()-2);
		
		System.out.println(shoppingListReport);
		System.out.println("Total price: " +totalPrice);
	
	

}
}
