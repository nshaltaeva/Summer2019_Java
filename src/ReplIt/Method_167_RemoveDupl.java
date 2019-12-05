package ReplIt;

public class Method_167_RemoveDupl {
	public static void main(String[] args) {
	    //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
		  
		  String result = "";
			
			for(int i = 0; i < str.length(); i++) {
				if(!result.contains(str.substring(i, i+1))) {
					// i                           (0,1) ==> a
					result += str.substring(i, i+1);
				}
			}
				return result;  
	  
	  
	  }
	  

}
