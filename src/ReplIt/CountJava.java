package ReplIt;

import java.util.Scanner;

public class CountJava {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
		
	   
	    String java = "java";
	    int count = (word.length() - word.replace(java, "").length()) / java.length();

	    //Display the result...
	    System.out.println(count);
		
	 //   String sentences = "I like books, I have books, I need book book book book";
		//      include            i   i+4 ==> book
		
		int count1 = 0;
		for (int i = 0; i <word.length()-3; i++) {
			//          16    17
			if(word.substring(i, i+4).equals("java")) {
				count1++;
			}
		}
		System.out.println(count1);
		
		
		
		
		
		
		
	}

}
