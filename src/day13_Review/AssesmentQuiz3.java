package day13_Review;

public class AssesmentQuiz3 {
	
			public static void main(String[] args) {
				
		//Q1
				int num = 9;
				if(num++ == 10) {// next step num = 10
				// 9     == 10 ==> false
					System.out.println("Hello World"+num);
				}
				else {
					System.out.println("Hello Universe"+num);
					//                                   10
				}
				
		//Q2 if statement
		int score = 0;
		if(score == 0) {//true
			score += 50;//score = 50
		}
		if(score != 0) {
		// 50 != 0 ==> true
			score += 50; // 50+50 = 100
		}
			System.out.println(score);	
				
		//Q3
			char grade ='A';
			boolean Passed = grade == 'A' || grade =='B';
			//                 'A' == 'A' || 'A' == 'B'
			//                  true      ||  false   ==> true
			boolean Passed2 =grade == 'C' || grade =='D';
			//                'A'  == 'C' ||  'A' == 'D'
			//                   false    ||    false  ==> false

			if( Passed || Passed2) {
             //   true  || false  ==> true in OR logic
			System.out.println("You've passed the exam");

			}else {
			System.out.println("You failed");
			}
				
			
			//Q4.	
			boolean A = true, B =  !false;
						//     B =   true
			if(B) {
			System.out.println("B");
			}
			else if(A) {
			System.out.println("A");
			}
			else {
			System.out.println("C");
			}	
				
			//Q5
			boolean result = true;

			if(result) {
			System.out.println("it's true");
			}
			else {
			System.out.println("it's false");
			}
	//		else if(result) {
	//		System.out.println("None of the above");
		//	}
			
			//Q8
			boolean A1 = true, B1 = !A1;  
			//         true      B1 = false

			if(A1) {
				if(B1) {
			System.out.println("Monday");
			}
				else {
			System.out.println("Tuesday");
			}
			}
			else {
				if(A1) {
			System.out.println("Thursday");
			}
				else {
			System.out.println("Friday");
			}
			}
			
			
			//Q9:
			
			int number =10;

			if(--number > 10) {
			// 9 >10 ==> false

			System.out.println("Hello Cybertek "+number);

			}else if(number ==9) {

			System.out.println("Hello World "+number);
			//                                  9
			}
			
			
			//Q10:
			boolean X = true;
			boolean Y = !X==false; //Y = true
			//          false == false ==> true
			boolean Z = Y; // Z = true

			if( X ) {
			System.out.println("Hello Everyone");
			} if( Y ) {
			System.out.println("Today is great day");
			} if( Z ) {
			System.out.println("We have picnic on Saturday");
			}
			
			
			
			
			
			
			
			
			
			
				
				
				
				
				
				
			}

}
