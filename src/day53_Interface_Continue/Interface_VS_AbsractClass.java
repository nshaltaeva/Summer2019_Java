package day53_Interface_Continue;

public interface Interface_VS_AbsractClass {
	
//	public Interface_VS_AbsractClass() {}
	
	public abstract void method1();
	public abstract int method2();
	
	public void method3();//by default it given abstract	
	 void method4(); //also public access modifier given by default
	 
	 public default void mm() {
		 //predicate
	 } 

//	 protected abstract void method5(); ==  public protected abstract void method5()
	//because public given by default
	 
	 int a =10; //by default int a is public final static that's why we need assign right away
//	 static int a;
	 
	 public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Interface_VS_AbsractClass.a);
		
	//	Interface_VS_AbsractClass obj = new Interface_VS_AbsractClass();
		//interface is not a class
		//Abstraction is not concrete, but object has to be concrete
		
		
		
		
		
	}
	 
	 
}

class Test implements Interface_VS_AbsractClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
	
}