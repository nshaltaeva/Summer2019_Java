package ReplIt;


import java.util.Scanner;

public class EqualJava {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    
	    int count=0;
	   int count2 =0;
	   
	  String java = "java";
	  String python = "python";
	  
	  count = (sentence.length() - sentence.replace(java, "").length()) / java.length();
	 //   System.out.println(count);
	    
	    count2 = (sentence.length() - sentence.replace(python, "").length()) / python.length();
	//    System.out.println(count2);
	      
	   boolean b1 = (count == count2)? true : false; 
		
		System.out.println(b1);
		
	}

}
