package ReplIt;
import java.util.*;
public class Seconds {
	
	public static void main(String[] args) {
		
		/*
		 3695/60 --> minutes
		 		--> 61.58 minutes
		               58 seconds 			
		 
		 left seconds(58) /60 --> hours
		 
		 3600 == 1 hour
		 inputSeconds % 60 == hours
		 
		 hours = inputSeconds/3600; // 3695 /3600 == 1
		 leftSeconds = inputSeconds %3600;// 3695%3600== 95
		 munites = leftSeconds/60; //95 --> 1  35
		 leftSeconds = leftSeconds%60; //35
		 
		 
		 
		 
		 
		 */
		
		
		
		
		
		
		
		Scanner in = new Scanner(System.in);
		
		int leftSeconds;
        System.out.print("Enter seconds:\n");
		int inputSeconds = in.nextInt(); 
		
		
        
        int hours = inputSeconds / 60;
        int munites = hours % 60;
        hours = hours / 60;
        int seconds = inputSeconds % 60;
        System.out.println( hours + " hours, " + munites + " munites, and " + seconds + " seconds");
		
         hours = inputSeconds/3600; // 3695 /3600 == 1
		 leftSeconds = inputSeconds %3600;// 3695%3600== 95
		 munites = leftSeconds/60; //95 --> 1  35
		 leftSeconds = leftSeconds%60; //35
		
		 System.out.println(hours + " hours, " + munites + " munites, and " + leftSeconds + " seconds");
		
		
		
	}

}
