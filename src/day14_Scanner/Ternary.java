package day14_Scanner;

public class Ternary {
	public static void main(String[] args) {
		
		int num = 0;
		if(true) {
			num = 100;
		}else {
			num = 50;
		}
		System.out.println(num);
		
		//ternary
		/*
		 if(condition)   ==> (Condition)?
		 else            ==>   :
		 else if ()      ==>  :(Condition)?
		 */
		
		
		
	//	int num1 = 0;
		num = (true) ? 100 : 50; //ternary returns a Value
						
	int	n = (false) ? 50 : 10;
			
	int y = false ? 100 : 50; // ( ) is not necessary
		
	System.out.println(y);
	System.out.println(num);	
	System.out.println(n);	
		
	System.out.println("====================");	
		
	String SchoolName = "";
	boolean Batch12 = true;
	
	if (Batch12) {
		SchoolName = "Cybertek";
	}else {
		SchoolName = "Invalid";
	}
		
		
	//ternary
	
	System.out.println(Batch12 ? "Cybertek" : "Invalid");
	
	String BestSchool = Batch12 ? "Cybertek" : "Invalid";
	System.out.println(BestSchool);
	
	System.out.println("=============");
	
	
	double d = 10;
	if (true) {
		d = 10.5;
	}
	
	double z = true ? 10.5 : 0;
	
	System.out.println(d);
	System.out.println(z);
	
	System.out.println("===========");
	
	double interestRate = 0;
	boolean GoodCredit = true;
	
	interestRate = GoodCredit == true ? 0.5 : 0.9;
	
	System.out.println(interestRate);
	
	System.out.println("=================");
	byte grade = 50;
	boolean Passed = grade >= 60 ? true: false;
	System.out.println(Passed);
	
	char FinalGrade = 'D';
	String Group = "";
	if(FinalGrade == 'A') {
		Group = "Early Birds";
		
	}else if(FinalGrade == 'B') {
		Group = "Group 1";
	}else if(FinalGrade == 'C') {
		Group = "Group 2";
	}
	else {
		Group = "After Group 2";
	}
	
	
Group =	(FinalGrade == 'A') ? "Early Bird" : 
								(FinalGrade == 'B') ? 
									"Group 1" : "After Group 1";
	
	System.out.println(Group);
	
Group = (FinalGrade == 'A') ? "Early Birds" 
		: (FinalGrade == 'B') ? "Group 1"
				:(FinalGrade == 'C') ? "Group 2"
						: "After Group 2";
	System.out.println(Group);
	System.out.println("============");
	
	int score = 110;
	char Finals = ' ';
	
	if (score >= 90 && score <= 100)
		Finals = 'A';
	else if (score >= 80 && score <= 89)
		Finals = 'B';
	else if (score >= 70 && score <= 79)
		Finals = 'C';
	else if(score >= 60 && score <= 69)
		Finals ='D';
	else if (score >= 0 && score <= 59)
		Finals = 'F';
	else 
		Finals = ' ';
	
	score = 110;
	Finals = (score >= 90 && score <= 100)? 'A'
			:(score >= 80 && score <= 89)? 'B' 
					: (score >= 70 && score <= 79)? 'C' 
							: (score >= 60 && score <= 69)? 'D'
									: (score >= 0 && score <= 59)? 'F'
											: '?';
	
	
	System.out.println(Finals);
	
	int n1 = 100000, n2 = 300000000, n3 = 400;
	
	int max = (n1>n2 && n1>n3) ? n1
			: (n2>n1 && n2>n3) ? n2
					:n3;
	System.out.println(max);
	
	int max1 = (n1>n2)?n1:n2;
	System.out.println(max1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	}

}
