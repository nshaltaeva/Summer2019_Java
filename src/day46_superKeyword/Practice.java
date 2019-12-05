package day46_superKeyword;

class parent{
	
	public parent(int a) {
		this(2.5);
		System.out.println("A");
	}
	
	public parent(double a) {
		System.out.println("C");
	}
	
	static int  x=10;
	int i=20;
}


public class Practice extends parent{
	//        sub              super
	
	/*
	 * invisible by default, if there is no any constructor with args
	public Practice() {
		super();
	}
	*/
	int a;
	int y;
	
	private Practice() {
		super(10);
		System.out.println("B");
		initiliaze(a, y);
		this.a =100;
		a=100;
	}
	
	public Practice(int a, int y) {
		super(2.5);
	}
	private void initiliaze(int a, int y) {
		
	}
	public static void main(String[] args) {
		Practice obj = new Practice();
		Practice obj1 = new Practice();
		obj.a =100;
//		this.a = 100;
		System.out.println();
//	obj.initiliaze(a, y);
		
		
		System.out.println(obj.x = 25);
		System.out.println(obj1.x = 30);
		
		
		
	}
	

}
