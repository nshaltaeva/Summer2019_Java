package day08_ShortHandOperators;

public class LogicalOperators {
	
	/*
	 &&: And logic ==> true && true == true, if both conditions are true will return true
	 ||: Or logic ==>  true || false ==> true
	                   true || true ==> true
	                   false || false ==>false
	                    
	 */
	
	public static void main(String[] args) {
		
		// &&
		
		boolean ResultA = 9 == 0 && "Muhtar" == "good";
		//                false          false        ==> false
		System.out.println(ResultA);
		
		boolean resultB = 8>5 && 7 == (8-2+1);
				//       true     true
		System.out.println(resultB);
		
		boolean resultC = !false != true && !false ==!(!true);
		//                true != true &&  true ==!false
		//                  false &&         true ==> false
		System.out.println(resultC);
		
		//  ||
		boolean A = "Monday" == "Funday" || 6==6;
		//             false             || true
		System.out.println(A);
		
		boolean B = true || false;
		System.out.println(B);
		
		boolean C = !(8>5) || !("Today" != "Friday");
		//           !true  ||   !true  ==>  false
		System.out.println(C);
		
		// ||  &&
		
		boolean D = true && true || false;
		//            true      ||  false
		System.out.println(D);
		
		boolean E = !(7>5 && 6 != 5) && (9>5 || 10>4);
		//            !true          &&       true
		//             false         &&       true
		System.out.println(E);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
