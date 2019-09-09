package day16_Recap;

public class Kahoot {
	public static void main(String[] args) {
		
		//q4
		int Batch = 12;
		switch(Batch) {
	//	case 014: //it cannot started from 0
	//		System.out.println("Cybertek");
	//		break;
		case 12: 
			System.out.println("Best");
			default:
				System.out.println("Batch");
				
				
		//q8
				int x =5, y = 19;
				long  num = (y-x > x-y)?y-x:x-y;
				System.out.println(num);
				
		//9
				
			int sum  = 2, price = 100;
			
			sum *= price >= 100 ? price *= 2: price;//price = price* 200
			//      100  >= 100  ? 200      : 100
			// sum *= 200; ==> 400
				
			System.out.println(sum+" "+price);	
				
				
				
				
				
				
				
				
				
				
		}
	}

}
