package day36_JavaReview;

public class ConstructorReview {
	
	public ConstructorReview() {
		System.out.println("Hi");
	}
	public ConstructorReview(int a) {
		System.out.println("constructor with argument int: "+a);
	//	this();
	}
	public ConstructorReview(short a) {
		System.out.println("constructor with argument byte: "+a);
	}
public static void main(String[] args) {
	ConstructorReview obj = new ConstructorReview();
	ConstructorReview obj1 = new ConstructorReview(10);
	ConstructorReview obj2 = new ConstructorReview(10);
}
}
