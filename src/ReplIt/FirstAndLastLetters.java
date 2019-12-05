package ReplIt;
import java.util.Scanner;

public class FirstAndLastLetters {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    String firstLetter = word.substring(0,1);
	    String LastLetter = ""+word.charAt(word.length()-1);
	    
	    System.out.println(firstLetter+LastLetter);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
