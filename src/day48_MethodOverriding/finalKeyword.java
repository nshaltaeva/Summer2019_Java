package day48_MethodOverriding;

class Credentials {
	 private final String UserName = "Cybertek";
	 private final String PassWord = "Batch12";
	 
	 
	 public String getUserName() {
		 return UserName;
	 }
	
	 /*
	 public void setUserName(String UserName) {
		 this.UserName = UserName;
		 //final variables cannot be reassigned
	 }
	 */
	 
}

class Holy{
	
	final public void printName() {
		System.out.println("Erhan");
	}
}

public class finalKeyword extends Holy{
	
	/*final method cannot be override
	@Override
	public void printName() {
		System.out.println("Madina");
	}
	*/
	final int AGE =18; //if declared like final, static and instance variables should assigned immediately
	
	public final static void main(String[] args) {
		
		final String SSN  = "123456";
	//	SSN = "2345678"; //final variables are constant and cannot be reassigned
		
		final String DateOfBirth;
		
				
		System.out.println(SSN);
	//	System.out.println(DateOfBirth); //we have to assign it before to use it
		
		finalKeyword obj = new finalKeyword();
		System.out.println(obj.AGE);
		
		
		
	}
	
	public final static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static double add (double a, double b, double c) {
		return a+b+c;
	}

}
