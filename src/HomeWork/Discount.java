package HomeWork;

import java.util.Scanner;

public class Discount {
	
	/*
	 Write a Java program to calculate total amount of 
	 sale based on the unit price and quantity of a product taken.
User should be able to enter unit price and quantity.
Then the program will perform calculations and display amounts.
The discount rate is 10% for the quantity purchased 
between 100 and 120 units, and 15% for the quantity 
purchased greater than 120 units.
If the quantity purchased is less than 100 units, 
the discount rate is 0%.
See the example output as shown below:
Input:
Enter unit price: 25
Enter quantity: 110
Output:
Grand Total: $ 2750.0

	 */
	
	public static void main(String[] args) {
		
		
	       Scanner input = new Scanner(System.in);
	       
	        System.out.print("Please enter price of the item: ");
	        float price = input.nextFloat();
	        System.out.println("\nPlease enter quantity of the item :");
	        float quantity = input.nextFloat();
	        
	        float grandTotal = price * quantity;
	        float discount;
	        float applied;
	        
	        if (quantity < 100) {
	            discount = 0;
	            applied = 0;
	        }
	        else if (100<= quantity && quantity <= 120) {
	            discount = 10;
	            applied = grandTotal * 10 / 100;
	        }
	        else {
	            discount = 15;
	            applied = grandTotal * 15 / 100;
	        }
	        float total = grandTotal - applied;
	        
	        System.out.println("\nGrand Total: $"+grandTotal);
	        System.out.println("Discount: %"+discount);
	        System.out.println("Discount Applied: $"+applied);
	        System.out.println("Total: $"+total);
		
		
		
		
		
		
		
		
		
		
	}

}
