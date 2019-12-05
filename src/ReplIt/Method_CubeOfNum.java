package ReplIt;
import java.util.Scanner;
public class Method_CubeOfNum {
	public static void cube()
	  {
	    //your code here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		n = n*n*n; //cube of 5 = (5*5)*5
		
		System.out.println(n);
		
		
		
		
	  }//end cube
	  
	  public static void main(String[] args) {
	    
	    cube();
	   
	  }
}
