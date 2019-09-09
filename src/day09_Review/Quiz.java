package day09_Review;

public class Quiz {
	
	public static void main(String[] args) {
		System.out.println("Question 2");
		//Question 2
		boolean res = !false != ("Batch12" != "Best Batch Ever");
		//             true  !=   true
		//               false
		System.out.println(res);
		System.out.println("Question 3");
		//Question 3
		int x=100;
		int y = x += 100/20;
		//       x = x+(100/20) = 105
		//     y = 100 + 5
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("Question 5");
		//Question 5
		boolean A = 128 > '9' ||  128 == 127; 
		//           true     ||   false     ==> true
		System.out.println(A);
		
		System.out.println("Question 6");
		//Question 6
		boolean StupidOperators = 10>=20  &&   'a' > 'b';
		//                        false   &&     false  ==> false
		System.out.println(StupidOperators);
		
		System.out.println("Question 7");
		//Question 7
		int num1 = 9999999;
		int num2 = 10;
		System.out.println(num1*num2/10%num1);
		//                
		
		System.out.println("Question 9");
		//Question 9
		
		int z =100;
	//	System.out.println("z>100 is:" + H); // top to buttom, h is not defined
		
		boolean H = z>100; //false
		System.out.println(H);
		
		

		System.out.println("Question 12");
		//Question 12
		
		int NumA = 100;
		NumA += 300; 
		System.out.println(NumA++ + "\n " + NumA); //401 
		//                  400            401
		
		System.out.println("Question 14");
		//Question 14
		
		System.out.println((10*2)/(5*4)*1000/10%100);
		//                    20/20*1000/10%100
		//                          1000/10%100
		//                           100%100
		//                              0
		
		
		
		
		
		
		
		
		
	}

}
