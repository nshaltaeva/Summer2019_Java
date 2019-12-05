package day24_JavaRecap;

import java.util.Scanner;

public class MuhtarsTimerInMimutes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Minutes");
		int minutes = scan.nextInt();
		minutes = minutes - 1;
		while (minutes > 0) {
			int seconds = 59;
			while (seconds > 0) {
				System.out.println(minutes + " minutes and " + seconds + " seconds left");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				--seconds;
			}
			if (minutes < 0)
				break;
			--minutes;
		}
		int seconds = 59;
		while (seconds > 0) {
			System.out.println(seconds + " seconds left");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			--seconds;
		}
		System.out.println(" \n \t \t********************************************* ");
		System.out.println("  \t \t***                                       *** ");
		System.out.println("   \t \t***  Times is Up, Please take your seats! *** ");
		System.out.println("    \t \t***                                       *** ");
		System.out.println("     \t \t********************************************* ");
		scan.close();

		// to orginize: command + shift + f
	}
}
