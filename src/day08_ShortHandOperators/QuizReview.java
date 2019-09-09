package day08_ShortHandOperators;

public class QuizReview {
	
	public static void main(String[] args) {
		 
		String str = "Result A"+7*2;
		//           "Result A"+14;
		//            "Result A14"
		
		System.out.println(str);
		
		String str2 = "Result A" + 8%2;
		//             "Result A0
		
		System.out.println(str2);
		
	}

}
