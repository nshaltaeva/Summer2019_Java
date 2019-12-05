package day54_Polymorphisim;

interface Interface{
	abstract void get();
	
}

interface Interface2 extends Interface {
	abstract void frame();
}

abstract class AbstractClass1 {
	
}

public class Test2 extends AbstractClass1 implements Interface, Interface2{
	
	

	public static void main(String[] args) {
		
		Interface obj = new Test2();
		obj.get();
		Interface2 obj2 = new Test2();
		obj2.frame();
		obj2.get();
		
		AbstractClass1 obj3 = new Test2();
		
		
		
	}

	@Override
	public void get() {
		System.out.println("Chrome browser");
	}

	@Override
	public void frame() {
		System.out.println("Frame");
		
	}
}
