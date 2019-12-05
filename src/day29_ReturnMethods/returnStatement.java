package day29_ReturnMethods;

public class returnStatement {
public static void main(String[] args) {
	
	for (int i=0; i <5; i++) {
		if(i == 3) {
			break;//exit loop and outside of loop can be printed
		}
		System.out.println(i);
	}
	
	System.out.println("completed");
	
	
	
	for (int i=0; i <5; i++) {
		if(i == 3) {
			return;//exit method and outside of loop cannot be printed
		}
		System.out.println(i);
	}
	
	System.out.println("completed");
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
