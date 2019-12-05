package day27_CustomMethods;

public class VoidMethod_RemoveDublicates {
	
	public static void main(String[] args) {
		
		
		String s = "JavaJavaJava";
		RemoveDuplicates(s);
	}
	
	public static void RemoveDuplicates(String Dubl) {
		 
			String result = "";
		
		for(int i = 0; i < Dubl.length(); i++) {
			if(!result.contains(Dubl.substring(i, i+1))) {
				// i                           (0,1) ==> a
				result += Dubl.substring(i, i+1);
			}
		}
			System.out.println(result);
			
	}
}
