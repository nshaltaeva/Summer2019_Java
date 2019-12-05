package day30_WrapperClass_ArrayList;

public class WarmUp_RemoveDuplicates {
	/*
	 1. write a return method that accepts a String and removes 
	 duplicate values from the String
    Ex:
        RemoveDuplicate("aaabbbccc") ==> "abc"
    2. write a return method that accepts String and returns 
    the unique values from the String
    Ex: 
            Unique("AABBCDEEE")  ==> "CD"
	 */
	public static void main(String[] args) {
	String str =	RemDup("aaabbbccc");
	System.out.println(str);
	
	String str1 = UniqValue("AABBCDEEE");
	System.out.println(str1);
	}
	
	//warmUp1
	public static String RemDup(String str) {
		String result = "";//to store non duplicates values
		for (int i=0; i<str.length();i++) {
			if (! result.contains(str.substring(i, i+1))) {
				result += str.substring(i, i+1);
			}
		}
		return result;
	}
	
	//WarmUp2 - unique is character will appears once
	
	public static String UniqValue (String str) {
		String result = "";//store unique characters
		
		for(int j=0;j<str.length();j++){
		int count =0; //count number of appearance
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i) == str.charAt(j)) {
				count++;
			}
		}
		if(count == 1) {
			result += ""+str.charAt(j);
		}
		
	}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
