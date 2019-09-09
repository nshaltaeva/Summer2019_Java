package ReplIt;

import java.util.Scanner;

public class ShoppingList {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Item1, count and its price:");
		String Item1 = scan.nextLine();
		int count1 = scan.nextInt();
		double price1 = scan.nextDouble();
		
		System.out.println("Enter Item2, count and its price:");
		scan.nextLine();
		String Item2 = scan.nextLine();
		int count2 = scan.nextInt();
		double price2 = scan.nextDouble();
		
		System.out.println("Enter Item3, count and its price:");
		scan.nextLine();
		String Item3 = scan.nextLine();
		int count3 = scan.nextInt();
		double price3 = scan.nextDouble();
		
		double totalPrice= count1*price1+count2*price2+count3*price3;
		double totalPrice2=count2*price2+count3*price3;
		double totalPrice3=count1*price1+count3*price3;
		double totalPrice4=count1*price1+count2*price2;
		double totalPrice5=count3*price3;
		double totalPrice6=count2*price2;
		double totalPrice7=count1*price1;
		
		
		if (count1 > 0 && count2 > 0 && count3 > 0 ) {
			System.out.println("Item1: "+Item1+" Price: "+count1*price1+", Item2: "+Item2+" Price: "+count2*price2+", Item3: "+Item3+" Price: "+count3*price3);
			System.out.println("Total price: "+totalPrice);
		}else if (count1 <= 0 && count2 > 0 && count3 > 0) {
			System.out.println("Item2: "+Item2+" Price: "+count2*price2+", Item3: "+Item3+" Price: "+count3*price3);
			System.out.println("Total price: "+totalPrice2);
		}else if (count2 <= 0 && count1 > 0 && count3 > 0) {
			System.out.println("Item1: "+Item1+" Price: "+count1*price1+", Item3: "+Item3+" Price: "+count3*price3);
			System.out.println("Total price: "+totalPrice3);
		}else if (count3 <=0 && count1 > 0 && count2 > 0){
			System.out.println("Item1: "+Item1+" Price: "+count1*price1+", Item2: "+Item2+" Price: "+count2*price2);
			System.out.println("Total price: "+totalPrice4);
		}else if (count1<=0 && count2<=0 && count3>0) {
			System.out.println("Item3: "+Item3+" Price: "+count3*price3);
			System.out.println("Total price: "+totalPrice5);
		}else if (count1<=0 && count3<=0 && count2>0) {
			System.out.println("Item2: "+Item2+" Price: "+count2*price2);
			System.out.println("Total price: "+totalPrice6);
		}else {
			System.out.println("Item1: "+Item1+" Price: "+count1*price1);
			System.out.println("Total price: "+totalPrice7);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
