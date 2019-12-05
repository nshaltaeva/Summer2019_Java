package day49_Abstraction;

public abstract class Abstraction {

	public abstract void startTheCar(); //abstract method
}

 class Toyota extends Abstraction{
	 
	 @Override
	 public void startTheCar() {
		System.out.println("Brake"); 
		System.out.println("Push the start button");
		System.out.println("Release the break");
	 }
	public static void main(String[] args) {
		
//		Abstraction obj = new Abstraction();
		
	}
}
 
 class Tesla extends Abstraction{
	
	 @Override
	public void startTheCar() {
		System.out.println("Voice control");
		System.out.println("Driver");
	} 
	 
	 
 }