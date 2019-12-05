package day42_OOP_Encapsulation;

public class EmployeeInfo {
	
	/*
	 Name
	 SSN
	 Age
	 Salary
	 */
	
	private String Name;
	private long SSN;
	private byte Age;
	private double Salary;
	
	//name
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}
	
	
	//SSN
	public void setSSN(long SSN) {
		this.SSN = SSN;
	}
	
	public long getSSN() {
		return SSN;
	}
	
	
	//age
	public void setAge(byte Age) {
		this.Age = Age;
	}
	
	public byte getAge() {
		return Age;
	}
	
	//salary
	
		public void setSalary(double Salary) {
			this.Salary = Salary;
		}
		
		public double getSalary() {
			return Salary;
		}
	
	//setInfo
		public void setInfo(String Name, long SSN, byte Age, double Salary) {
			this.Name = Name;
			this.SSN = SSN;
			this.Age = Age;
			this.Salary = Salary;
		}
	
		
	//getInfo
		public void  getInfo() {
			System.out.println(Name);
			System.out.println(SSN);
			System.out.println(Age);
			System.out.println(Salary);
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
