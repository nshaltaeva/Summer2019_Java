package day21_WhileLoops;

public class warmUp {
	
	public static void main(String[] args) {
		
		/*
		 1. write a java program that can count how many time
		 the word "book" is appeared in a String 
		 Ex: input: I like books, I have books, I need book
		 output: 3
		 */
		
		String sentences = "I like books, I have books, I need book book book book";
		//      include            i   i+4 ==> book
		
		int count = 0;
		for (int i = 0; i <sentences.length()-3; i++) {
			//          16    17
			if(sentences.substring(i, i+4).equals("book")) {
				count++;
			}
		}
		System.out.println(count);
		
		
	//solution2	
		
String word = "Cybertek is school,Cybertek is great, I love Cybertek";
//index        i    i+8
//substring    (i, i+7+1) ending index is excluded in substring
int nTimes = 0;
for (int i = 0; i<word.length()-7; i++) {
	//                  54
	if (word.substring(i, i+8).equals("Cybertek")) {
		nTimes++;
	}
	
}
	System.out.println(nTimes);	
		
	
	/*
	 remove duplicated values from String
	 Ex: input: aabbcc
	 out: abc
	 */
		
	String s1 = "aabbcc";
	
	String result = "";
	
	for(int i = 0; i < s1.length(); i++) {
		if(!result.contains(s1.substring(i, i+1))) {
			// i                           (0,1) ==> a
			result += s1.substring(i, i+1);
		}
	}
		System.out.println(result);
		
		//solution2
		
		for(int i = 0; i < s1.length(); i++) {
			if(!result.contains(""+s1.charAt(i))) {
				// i                           (0,1) ==> a
				result += s1.substring(i, i+1);
			}
		}
			System.out.println(result);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
