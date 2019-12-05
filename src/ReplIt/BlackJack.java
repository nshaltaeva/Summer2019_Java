package ReplIt;

import java.util.Scanner;

public class BlackJack {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter player");
		int player = scan.nextInt();
		System.out.println("Enter house score");
		int house = scan.nextInt();
		
		if (player >= 21 && house >=21) {
			System.out.println("bust");
		}
		else if (house > player) {
			System.out.println("player loss");
		}
		else if (player == house) {
			System.out.println("its a tie");
		}
		else if (player > house ) {
			System.out.println("player wins");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
