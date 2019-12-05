package day38_CustomClass_continue;

public class Employee {

	String Name;
	String ID;
	int age;
	int SSN;
	String JobTitle;
	double Salary;
	
	public Employee(String Name, String ID, int age, int SSN, String JobTitle, double Salary) {
		this.Name = Name;
		this.ID = ID;
		this.age = age;
		this.SSN = SSN;
		this.JobTitle = JobTitle;
		this.Salary = Salary;
		
		
	}
	
	public void getInfo() {
		System.out.println("----------------------------------------");
		System.out.println("Employee' name is: "+Name);
		System.out.println("SSN is: "+SSN);
		System.out.println("Age is: "+age);
		System.out.println("Job title is: "+JobTitle);
		System.out.println("Employee ID: "+ID);
		System.out.println("Salary is: $"+Salary);
		System.out.println("----------------------------------------");
	}
}
