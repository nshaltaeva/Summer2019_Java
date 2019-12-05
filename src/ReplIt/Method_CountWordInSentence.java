package ReplIt;

import java.util.Scanner;

public class Method_CountWordInSentence {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		System.out.println(wordCount(sentence));
		
		
		
	}
	
	
	
	
	public static int wordCount(String words) {
	//int count=1;
	String [] arr = words.split(" ");
	
	return arr.length;
	
 /*
	  for(int i=0;i<words.length();i++)
	  {
	   if(words.charAt(i)==' ')
	    count++;
	  }		
		
	*/	
		
		
		
		
		
	/*	if(words == null || words.isEmpty())
	        return 0;

	    int count = 0;
	    for(int i = 0; i < words.length(); i++){
	        if(words.charAt(i) != ' '){
	            count++;
	            while(words.charAt(i) != ' ' && i < words.length()-1){
	                i++;
	            }
	        }
	    }
	     */
	//    return count;
	     
	  }
	  
	
	
	
	
}
