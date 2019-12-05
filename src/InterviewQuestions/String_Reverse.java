package InterviewQuestions;

public class String_Reverse {
	
	public static void main(String[] args) {
		String str = StrReverse2("nurzat");
		System.out.println(str);
	}

//	Solution 1

	public static String StrReverse2(String str) {

	String reverse="";

	for(int i=str.length()-1; i >= 0; i--)

//	reverse += str.toCharArray()[i];

	 reverse += str.charAt(i);

	return  reverse;

	}

	
//	Solution 2

//	public  static String  Reverse(String str) {

//	return new StringBuffer((str).reverse().toString());

//	}
}
