package day13_Review;

public class KahootAndQuizReview {
	
	public static void main(String[] args) {
		
		//Kahoot 
		//Q1
		if (!true != !false) {
			//false != true ==> true
			System.out.println("Cybertek");
		}else {
			System.out.println("Batch12");
		}
		
		//Q2
		boolean resultA = 9>=9 || 10<=10,
				resultB = 'A'>=128 && 'B' <= 128;
		// resA = true || true ==> true
		// resB = false && true ==> false
				
				if(resultA) {
					//true
					if(resultB) {
						//false
						System.out.println(resultA);
					} else {
						System.out.println(resultB);
					}
				}
				
		//Q3: // 
				if(true) {
					
				}else if (false) {
					
				}
		//else block is not mandatory
				
				
				//Q4:
				int num = 9;
				if(++num<10) {
					//10<10
					System.out.println(num+"Hello World");
				}else {
					System.out.println(num+"Hello Universe");
					//                  10+"Hello Universe"
				}
					
				int num1 = 9;
				if(num++<10) {
					//9<10
					System.out.println(num1+"Hello World");
					//					10+Hello World
				}else {
					System.out.println(num1+"Hello Universe");
				}
		//Q5.
				int x = 1;
				int y = 0;
				
				if(x++ > ++y) {//x=2, y =1
				//	1>1 ==> false
					System.out.print("Hello");
				}else {
					System.out.print("Welcome");
				}
		
				System.out.println(" Log "+x+":"+y);
		
		
			//Q6: double > float 
				
			//Q7:
				//if single
				if(true) {
					System.out.println("one");
				}
				if(true) {
					System.out.println("two");
				}
				if(true) {
					System.out.println("three");
				}
				
				//if multi-branch
				if(true) {
					System.out.println("1");
				}else if(true) {
					System.out.println("2");
				}else if(true) {
					System.out.println("3");
				}
				
				boolean Result = true;
				
				int N =100;
				if (Result) {
					//true
					N /= 10;//N=N/10 =10
					Result = !Result;//Result = false
				}if(Result) {
					//false
					N *= 2; // N = 10
					
				}else {
					N -= 5; // N = 10-5 = 5
				}
				System.out.println(N);
	
				
				
				
				
				//Q8:
				boolean X = true;
				
				if (X == false) {
					// true == false ==> false
					System.out.println("One");
				}
				else if (X == false != true) {
					//   true == false != true
					//     true == true ==> true
					System.out.println("two");
				} 
				else if (X == true) {
					System.out.println("three");
				}
				else if (X != false) {
					System.out.println("Four");
				}
				
				
				
				//Q9: 
				
				
			//	Q10:
				
				int n1 = 'B';//form ASCII table corresponding number 
				
				System.out.println(n1);
				
				char a = 'B';
				System.out.println(a);//char printed 
				
				if(n1 >128 || n1 <= 129) {
				//  false  || true    ==> true
					System.out.println('B');
				}else {
					System.out.println('A');
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
	}

}
