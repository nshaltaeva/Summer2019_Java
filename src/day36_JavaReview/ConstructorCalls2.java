package day36_JavaReview;

public class ConstructorCalls2 {
	public ConstructorCalls2() {
	//this(true); //constructor cannot contain itself
}

	public ConstructorCalls2(boolean a) {
	//	this(true); // constructor cannot call itself
		this();
	}


	public ConstructorCalls2(String name) {
//	this("hello");//cannot call itself
	this('s');	
}

	public ConstructorCalls2(char ch) {
//	this("hi");	//constructor cannot contain itself
	}

















}
