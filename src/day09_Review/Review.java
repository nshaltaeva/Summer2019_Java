package day09_Review;

public class Review {
	
	public static void main(String[] args) {
		
		/*
		 relational: 
		 > : greater 
		 >=:
		 < :
		 <=:
		 ==:
		 !=;
		 
		 logical: 
		 &&: true: if both conditions are true
		 ||: true: if one of them true is true
		 */
		
		
		//>:
		System.out.println('Z' > 'A'); //true
		
		System.out.println('Z' >= 'A'); // true
		
		System.out.println( 'a' > 'A'); //true
		
		System.out.println('a' < 'A'); //false
		
		System.out.println('A' <= 'A'); //!false
		
		System.out.println('A' <= 'a'); //!false
		
		System.out.println(false == false); //true
		
		System.out.println(false != true);// true
		
		System.out.println(true == true && false !=true);
		//                  true        &&    true  ==> true
		
		System.out.println(true != true || false == true);
		//                    false   || false   ==> false
		
		System.out.println("Monday" == "Funday" || true != false);
		//                      false           ||   true   ==> true
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
	}

}
