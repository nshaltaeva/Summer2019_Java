package ReplIt;

import java.util.Scanner;

public class Method_Palindrome {
	
	public static boolean isPalindrome(String check) {
	   check = check.replace(" ","");
	   String reversed = "";
	   for(int i = check.length()-1; i >=0; i--) {
		  reversed += check.charAt(i); 
	   }
	//   String [] arr = reversed.split(" ");
	//   String NewRev = "";
	//   for(int i=0;i <= arr.length-1; i++) {
	//    	NewRev += arr[i];
	//    }
boolean result = check.equalsIgnoreCase(reversed) ? true : false;
	
		return result;
	  }
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String word = input.nextLine();
	System.out.println(isPalindrome(word));
	
	  String reversed = "";
	   for(int i = word.length()-1; i >=0; i--) {
		  reversed += word.charAt(i); 
	   }
	   String [] arr = reversed.split(" ");
	   String NewRev = "";
	   for(int i=0;i <= arr.length-1; i++) {
	    	NewRev += arr[i];
	    }
	System.out.println(NewRev);
	
	
	
	
	
	
	
}
}
