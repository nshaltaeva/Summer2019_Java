package day19_forLoop;

public class Tasks {
public static void main(String[] args) {
	
	//Task1
			for(int i = 1; i<= 10; i++) {
				System.out.println("The square of "+i+" is "+ (i*i));
			}
			System.out.println("==========");
	//Task01 between 1 to 32 all even numbers
			
			
			
		for(int i = 1; i <= 32; i++){
			if (i%2 ==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n=================");
		//task 02 all odd numbers between 1 to 32
		
		for(int i = 1; i <= 32; i++){
			if (i%2 == 1) {
				System.out.print(i+" ");
			}
		}
			
		System.out.println("\n==========");
		
		
		String str = "Java";
		// reverse "avaJ"
		String Rev = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
		System.out.println(Rev);	
			
		String Rev2 = "";
		for(int i = 3; i >= 0; i--) {
			Rev2 += str.charAt(i); //Rev2 = Rev2 + str.charAt(i)
		}
		System.out.println(Rev2);	
		
		String str1 = "Java is fun";
		
		String Rev3 = "";
		for(int i = str1.length()-1; i >= 0; i--) {
			Rev3 += str1.charAt(i); //Rev2 = Rev2 + str.charAt(i)
		}
		System.out.println(Rev3);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}
