package HomeWork;

import java.util.Scanner;

public class VendingMachine {
	
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.print("Enter price in Cents: ");
        int price = input.nextInt();
        int dollar = 100;
        int change = dollar-price;
        int quarters = change/25;
        change -= quarters*25;
        int dimes = change/10;
        change -= dimes*10;
        int nickles = change/5;
        
        System.out.println("Your change is "+ quarters+" quarters "+dimes+
                " dimes "+nickles+" nickles");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	}