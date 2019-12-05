package day29_ReturnMethods;

public class WarmUp_Frequency_InterviewQuestion {
	/*
	 1. write a method that can find the frequency of characters in String.
	 Ex:
	 	FrequencyTest ("XXXYYYZZZ")
	 	output: X3Y3Z3
	 	
	 	FrequencyTest ("AAABBBBBCCC")
	 	output: A3B5C4
	 */
	public static void main(String[] args) {
			
	String str = "aaabbbddddcccaabd";
	
	String RemoveDup = "";//to store non-duplicate values of the str
	
	
	
	for(int i = 0; i < str.length(); i++) {
		if (!RemoveDup.contains(str.substring(i, i+1))) {
			RemoveDup += str.substring(i, i+1);//will concat character from str to RemoveDup
		}
		
	}
	System.out.println(RemoveDup);	
		
		
	// str = "aaabbbddddcccaabd"; RemoveDup = "abcd"
	//										   j, j+1
		// result = a5b4c3d5
		
		String result = "";//store expected result
		 int count = 0;//count the numbers occurred characters
		
		for(int j=0; j < RemoveDup.length(); j++) {
		 for(int i=0; i <str.length(); i++) {
			 if(str.substring(i, i+1).equals(RemoveDup.substring(j, j+1))) {
				 count++;
			 }
		 }
		 result += RemoveDup.substring(j, j+1)+count;
		
		}
		 System.out.println(result);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
