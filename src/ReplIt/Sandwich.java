package ReplIt;

import java.util.Scanner;

public class Sandwich {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String str = scan.next();
   
    int first = str.indexOf("bread");
    int last = str.lastIndexOf("bread");
    if((last != -1 && first!=last))
    	System.out.println( (str.substring(first+5,last))) ;
    else
    	System.out.println("nothing");
    
    
    
    
    
   /* 
    
    
    String s="bread";
 //    System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"))); 
    if (str.length() > 10 || str.substring(str.indexOf(s)+5,str.lastIndexOf(s)).length()>0) {
   // String	str1 = "";
    System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));
    }else {
    	System.out.println("nothing");
    }
    */
    
    
   /* int a = str.length()/2 ;
    if(str.contains(str1)) {
    System.out.println(str.substring(a-1,a+2));
    }else {
    	System.out.println("nothing");
    }
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
