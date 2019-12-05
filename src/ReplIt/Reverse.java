package ReplIt;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
			
		
		
		if (word.length() == 5) {
		
		String Rev3 = "";
		for(int i = word.length()-1; i >= 0; i--) {
			Rev3 += word.charAt(i); //Rev2 = Rev2 + str.charAt(i)
		}
		System.out.println(Rev3);
		}
			
			else 	if(word.length() < 5) {
				System.out.println("Too short");
			}else {
				System.out.println("Too long");
				
			}
		
	    
	    
/*
        int i = 0;
    while ( true ) {
        i++;
        System.out.println("Hello: "+i);  // hello 1
        if(i == 5) {
            break;
        }
        
    }
*/	    
	    
	    
	    
	    
	    
	    
	    
	}

}
