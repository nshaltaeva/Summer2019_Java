package day26_ForEach;

public class ContinueStatement {
public static void main(String[] args) {
	
	
	for(int i=0; i<5;i++) {
		if(i>2) {
			continue;
		}
		System.out.print(i+" ");
	}
	
	System.out.println();
	
	int [] numbers = {1,2,3,4,5};
	
	for (int i=0; i<numbers.length;i++) {
		if(numbers[i]<3) {
			continue;
		}
		System.out.print(numbers[i]+" ");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
