package day47_JavaReview;

class A {
	public String name1 = "Ayaz";
	
}

class B extends A{// we have 3 instance variables
	//public String name = "Ayaz"; inherited from class A
	
	public String name2 = "Sukran";
	public String name3 = "Erhan";
	
	public void method1() {
		super.name1 = "Feride";
	}
	
}

public class Inheritance extends B{// we have 5 instance variables
	//public String name = "Ayaz"; inherited from class A
	//public String name2 = "Sukran";
	//public String name3 = "Erhan";
	
	public String name4 = "Mehmet";
	public String name5 = "Mahribana";
	
	public static void main(String[] args) {
		Inheritance obj = new Inheritance();//to call instance variables in static main method we need create an object
		System.out.println(obj.name1);
		System.out.println(obj.name2);
		System.out.println(obj.name3);
		System.out.println(obj.name4);
		System.out.println(obj.name5);
		System.out.println("===========================");
		
		B obj2 = new B();
		System.out.println(obj2.name1);
		System.out.println(obj2.name2);
		System.out.println(obj2.name3);
//		System.out.println(obj2.name4); //super class cannot inherit anything from sub class
//		System.out.println(obj2.name5);//super class cannot inherit anything from sub class
		System.out.println("=============================");
		
		A obj3 = new A();
		System.out.println(obj3.name1);
//		System.out.println(obj3.name2);//super class cannot inherit anything from sub class
//		System.out.println(obj3.name3);//super class cannot inherit anything from sub class
//		System.out.println(obj3.name4);//super class cannot inherit anything from sub class
//		System.out.println(obj3.name5);//super class cannot inherit anything from sub class
		
		
		
		
		
	}
	

}
