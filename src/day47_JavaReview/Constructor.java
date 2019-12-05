package day47_JavaReview;

class Mehmet{
	public Mehmet() {
		System.out.println("Mehmet");
	}
}

class Resul extends Mehmet{
	
	public Resul() {
		//super(); // Mehmet - invisible
		System.out.println("Resul");
	}
	
}

class Vika extends Resul{
	public Vika() {
		super();//it is optional when we are using default constructor
		System.out.println("Vika");
	}
	
}

public class Constructor {
	
	public static void main(String[] args) {
	//	Resul obj = new Resul();
		Vika obj2 = new Vika();
		
		
		
	}

}
