package ReplIt;

import java.util.Scanner;

public class FreeBook {
public static void main(String[] args) {
	
	 int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    boolean isPremiumCustomer = scan.nextBoolean();
	    int nbooksPurchased = scan.nextInt();
	    
	if (nbooksPurchased >= 5) {
	if (isPremiumCustomer) {
		if (nbooksPurchased >= 5 && nbooksPurchased <=7) {
			System.out.println("1 free book");
		}else {
			System.out.println("2 free books");
		}
	}else {
		if(nbooksPurchased >7) {
		if (nbooksPurchased >=7 && nbooksPurchased <=11) {
			System.out.println("1 free book");
		}else {
			System.out.println("2 free books");
		}
	}else {System.out.println("0");}
	}
	}else {
		System.out.println("no free books");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
