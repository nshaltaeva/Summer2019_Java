package day36_JavaReview;

public class ConstructorCalls {
	
	public ConstructorCalls() {
		System.out.println("A");
	}
	public ConstructorCalls(int a) {
		this();
		System.out.println("B");
	}
	public ConstructorCalls(char a) {
		this(10);
		System.out.println("char");
	}
	public ConstructorCalls(boolean a) {
		this ('a');
		System.out.println("boolean");
	}
	public static void main(String[] args) {
		ConstructorCalls obj = new ConstructorCalls(true);
	}

}
