package day43_JavaRecap;

public class staticKeyword {
	
	public String InstanceName = "Filiz";
	public static String StaticName = "Nurzat";
	
	
	public static void printName() {
	//	System.out.println(InstanceName); //instance can through the object
	System.out.println(StaticName);	//static only accepts static
	
		}
	
	public void printName2() { // instance method accepts all member
		System.out.println(InstanceName);
		System.out.println(StaticName);//class members are always accepted
	}

}
