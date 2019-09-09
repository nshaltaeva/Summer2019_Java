package day04_Variables2;

public class QuizCheck {
		public static void main(String[] args) {
			
			System.out.print("Hello");

			System.out.print(" Batch12");
	
			int i = 100;
			double d = 300L;
			float f =  200f;
			
		//	i=f; int is smaller than float
			f=i;
			d=f;
		//	f=d; double>float
			d=i;
		//	i=d; double>int
	
			float num1 = 10F; 
			double num2 = 10F;
			
			/*
			 \n(\r): new line
			 \t: tab
			 \\: single \
			 \': single '
			 \"	double "	
			 */
			System.out.println("Today is great Day\nFriday");
			System.out.println("\tTomorrow is Satuday, it's a day off");
			System.out.println("\\");
			System.out.println("\'Game od Thrones\'");
			System.out.println("I like to read \"books\"");
			
		}
}
