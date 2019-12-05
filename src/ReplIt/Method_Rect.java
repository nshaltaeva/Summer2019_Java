package ReplIt;

public class Method_Rect {
	
	public static void printHollowRect()
	  {
		
	for(int j=1; j<=5; j++) {
	   for(int i=1; i<=5; i++) {
		   if(i == 1 || i == 5 
			|| j == 1 || j ==5 )
		   System.out.print("*");
		   else
			   System.out.print(" ");
	   }
	   System.out.println();
	} 
	   
	   
	  }
	  
	  public static void main(String[] args) {
	   
	    printHollowRect();
	  }
	  
}
