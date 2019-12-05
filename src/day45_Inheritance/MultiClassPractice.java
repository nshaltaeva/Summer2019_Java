package day45_Inheritance;

class Data {
	public String name;
	private String age;
	String ID;
	
	public void Hello() { //public
		System.out.println("Hello");
	}
	
	private void Hola() { //private
		System.out.println("Hola");
	}
	
	void Aloha() { //default
		System.out.println("Aloha");
	}
	
	
}

public class MultiClassPractice {
	
	public static void main(String[] args) {
		
		Data obj  = new Data();
		System.out.println(obj.name);//public is visible at everywhere
//		System.out.println(obj.age); //private is visible only within the class Data
		System.out.println(obj.ID); //default is visible to the classes that are in the same package
		
		obj.Hello();//public
//		obj.Hola();//private
		obj.Aloha();//default
		
		
		
		
	}

}
