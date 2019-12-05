package day42_OOP_Encapsulation;

public class Cybertek {
	public static void main(String[] args) {
		
	EmployeeInfo emrah = new EmployeeInfo();
		
	//name
		emrah.setName("Emrah");
		System.out.println(emrah.getName());
		
	//SSN
		emrah.setSSN(1234567);
		System.out.println(emrah.getSSN());
		
	//age
		emrah.setAge((byte)20); //casting, because by default it is int
		System.out.println("Age is "+emrah.getAge());
	
	//Salary
		emrah.setSalary(120000);
		System.out.println(emrah.getSalary());
		
		
		System.out.println("===============================");
		EmployeeInfo Shirin = new EmployeeInfo();
		
		Shirin.setName("Shirin");
		Shirin.setAge((byte) 18);
		Shirin.setSSN(12333345);
		Shirin.setSalary(200000);
		
		System.out.println(Shirin.getName());
		System.out.println(Shirin.getSSN());
		System.out.println(Shirin.getAge());
		System.out.println(Shirin.getSalary());
		
		EmployeeInfo name = new EmployeeInfo();
		
		name.setInfo("Nurzat", 789750883L, (byte)18, 200000);
		name.getInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
