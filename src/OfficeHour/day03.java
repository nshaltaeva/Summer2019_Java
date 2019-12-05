package OfficeHour;

import java.util.Scanner;

public class day03 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scan.next();
		
		//I want to get 2nd last char
		//I will use CharAt()
		//I need to know the length of the word 1st
		//banana ==>last n
		
		int lengthOfWord = word.length();//6
		char secondLastChar = word.charAt(lengthOfWord-2);
		System.out.println(secondLastChar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
