package day47_JavaReview;

class Cinthya{
	
	public Cinthya(int a) {
		System.out.println("A");
	}
	
	public Cinthya(double a) {
		System.out.println("B");
	}
	
	public Cinthya(String a) {
		System.out.println("C");
	}
	
	public Cinthya() {
		System.out.println("D");
	}
}



public class Constructors2 extends Cinthya{
	
	public Constructors2() {
		super();
		//super(25);
		//super(2.5);
		//super("A");
		
		}
	
	public static void main(String[] args) {
		Constructors2 obj = new Constructors2();
		
	}
}
