package ReplIt;
import java.util.*;
public class Seconds {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("Enter seconds:\n");
		int inputSeconds = in.nextInt(); 
		
		
        
        int hours = inputSeconds / 60;
        int munites = hours % 60;
        hours = hours / 60;
        int seconds = inputSeconds % 60;
        System.out.print( hours + " hours, " + munites + " munites, and " + seconds + " seconds");
		
		
		
		
		
		
		
	}

}
