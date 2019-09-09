package day13_Review;

public class VoteAge {
	
	
	public static void main(String[] args) {
		
		/*
		 vote age
		 age >= 18 ==> eligible to vote
		 age >= 70 == can vote three times
		 70 > age  >= 50 ==> can vote twice
		 50 > age >= 18 ==> can vote once
		 */
		
		int age = 150;
		
		if (age >= 0 && age <=150) {
		if (age >= 18) {
			if (age >= 70) {// age >= 70
				System.out.println("Can vote three times");
			}else if (age >= 50) {//70> age >= 50
				System.out.println("Can vote two times");
			}else {//age<50
				System.out.println("Can vote once");
			}
		}else {
			System.out.println("Not eligible to vote");
		}
		
		}else {
			System.out.println("Invalid Entry");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
