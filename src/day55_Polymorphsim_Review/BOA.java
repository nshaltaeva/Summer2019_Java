package day55_Polymorphsim_Review;

import java.util.ArrayList;
import java.util.Arrays;

/*
 WarmUp:
    2. create an abstract class called ScrumTeam
            Data: Name
                  JobTitile
                  Salary
                  
                  Actions: DailyStandUp();
                     Demo();
                     
    3. Create the following sub classes of ScrumTeam:
                1. Testers:
                        Actions: FindBug
                2. Developers:
                        Actions: FixBug
    4. Create a class called BOF
            create Array of Testers named sdets, at leats store two objects
            create array of Developers named dev, at least store three objects
            create ArrayList of ScrumTeam:
                    store all the developer' and testers' objects
 */

abstract class ScrumTeam{
	public String Name, JobTitle;
	public double Salary;
	
	public abstract void DailyStandUp();
	public abstract void Demo();
	
	public void getEmployeeInfo() {
		System.out.println("==================================");
		System.out.println("Employee Name: "+Name);
		System.out.println("JobTitle: "+JobTitle);
		System.out.println("Salary: $"+Salary);
		System.out.println("==================================");
	}
	
	}

class Testers extends ScrumTeam{
	
	public Testers(String Name, String JobTitle, double Salary) {
		this.Name = Name;
		this.JobTitle = JobTitle;
		this.Salary = Salary;
		
		
	}

	@Override
	public void DailyStandUp() {
		// TODO Auto-generated method stub
		System.out.println("Tester "+Name+" is talking");
	}

	@Override
	public void Demo() {
		// TODO Auto-generated method stub
		System.out.println("Tester "+Name+" is doing demo");
	}
	
}

class Developers extends ScrumTeam{
	
	public Developers(String Name, String JobTitle, double Salary) {
		this.JobTitle = JobTitle;
		this.Name = Name;
		this.Salary = Salary;
	}

	@Override
	public void DailyStandUp() {
		// TODO Auto-generated method stub
		System.out.println("Developer "+Name+" is talking");
	}

	@Override
	public void Demo() {
		// TODO Auto-generated method stub
		System.out.println("Developer "+Name+" is doing demo");
	}
	
}

public class BOA {
	public static void main(String[] args) {
		ScrumTeam Madina = new Testers("Madina", "SDET", 130000);
		ScrumTeam Akerke = new Testers("Akerke", "Automation Tester",100000);
		ScrumTeam Erhan = new Testers("Erhan", "Manual Tester",50000);
			
		ScrumTeam[] testers  = {Madina, Akerke, Erhan};
	/*	for(Testers tester: testers) {
			tester.getEmployeeInfo();
		}
		
	*/
		ScrumTeam Nadire = new Developers("Nadire", "Senior Developer", 150000);
		ScrumTeam Mahir = new Developers("Mahir", "Junior Developer", 130000);
		ScrumTeam Parsa = new Developers("Parsa", "Medium Developer", 220000);
		ScrumTeam Dilara = new Developers("Dilara", "Developer", 200000);
		
		ScrumTeam [] developers = {Nadire, Mahir, Parsa, Dilara};	
	/*	for(Developers developer: developers) {
			developer.getEmployeeInfo();
		}
	*/	
		ArrayList<ScrumTeam> scrum = new ArrayList<>();
		scrum.addAll(Arrays.asList(testers));
		scrum.addAll(Arrays.asList(developers));
		
		for(ScrumTeam each: scrum) {
			each.getEmployeeInfo();
		}
		
		}

}
