package day15_Scanner_StringClass;

public class StringClass {

	public static void main(String[] args) {
		
		String str = "Cybertek"; //string literals in String pool
		String A = "Cybertek";
		String B = "Cybertek";
		
		System.out.println(A == B);//true
		
		
		String str2 = new String("Cybertek");//by using "new" keyword
		System.out.println(str == str2);//false
		//different memory location
		
		String str3 = new String("Cybertek");//by using "new" keyword
		System.out.println(str2 == str3);//false
		//every time will create new memory location
		
		
		
		
		
		
		
	}
}
