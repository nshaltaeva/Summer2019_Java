package day56_Polymorphisim;

class A1{
	public void method1() {
		System.out.println("m1");
	}
}

class B1 extends A1{
	public void method2() {
		System.out.println("m2");
	}
}
public class Child extends A1{
	public void method3() {
		System.out.println("m3");
	}
	public static void main(String[] args) {
		A1 obj = new Child();
	}
	
}
