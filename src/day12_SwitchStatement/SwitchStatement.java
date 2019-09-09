package day12_SwitchStatement;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		
		/* 
		 switch (expression) {
		 case CaseValue:
		 			statement;
		 			break;
		 		default:
		 		statement;
		 		break;
		 	}
		 */
		
		int score =3;
		
		if (score ==1) {//must give boolean
			System.out.println("1");
		}
		else if (score==2) {
			System.out.println("2");
		} else {
			System.out.println("Invalid");
		}
		
		
		switch (score) {//must give an expression: data
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
				
			default:
				System.out.println("Invalid");
				break;
				
		}
		
		
		System.out.println("================");
		
		String str ="Java";
		switch (str) {
		
		case "C#":
			System.out.println("C# programming language");
			break;
		case "Python":
			System.out.println("Python programming language");
		default://else
			System.out.println("Invalid");
		}
		
		System.out.println("=====================");
		
		
		char grade = 'A';
		
		switch (grade) {
		
			
		case 'B': 
			System.out.println("Passed with B");
		//	break;
		case 'C': 
			System.out.println("Passed with A");
	//		break;
			
		default : 
			System.out.println("Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
