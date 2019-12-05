package day46_superKeyword;

class A {
	String name = "Madina";
	public void method() {
		
	}
	
	public A(int a) {
		
	}
	
	public static void main(String[] args) {
		
	}
	
}

public class SuperKeyword extends A{
	//         sub               super
	
	//String name = "Madina";
	
	public SuperKeyword(double a) {
		super(10); //super class' constructor MUST be called in the sub class

	
	}
	
	public void method() {
		super.name = "Mahir";
		super.method();
		this.name = "Elbars";
		this.method();
		
	}
	
	

}
