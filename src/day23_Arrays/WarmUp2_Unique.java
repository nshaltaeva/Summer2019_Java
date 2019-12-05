package day23_Arrays;

public class WarmUp2_Unique {
	
	public static void main(String[] args) {
		
		/*
		 write a program that can find unique characters from a String
		 ex: 
		 input: AAABCDEEFF
		 output:
		 BCD
		 */
	
		String str = "AAAB CCCCC DDDD EEFF";
		// index:     i
		String Unique = "";// to store all the unique chars from str
		
		for(int j=0; j < str.length(); j++) {
		
		int count = 0;// count how many times the character is appeared
		
		for(int i = 0; i < str.length(); i++) {
			//highest value of i: str.length()-1
			if(str.substring(i,i+1).equals(""+str.charAt(j))) {
			//                                str.substring(j,j+1)	
				count++;
			}
		}
		
		if(count == 1) {
			Unique += ""+str.charAt(j);
		}
		}
		
		System.out.println(Unique);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
