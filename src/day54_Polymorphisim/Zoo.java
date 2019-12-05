package day54_Polymorphisim;

class Animal{
	public void Talk() {
		System.out.println("Animal is talking");
	}
}

class Tiger extends Animal{
	public void Hunt() {
		System.out.println("Tiger is hunting");
	}
	public void Talk() {
		System.out.println("Tiger is talking ==> roar");
	}
}

class Octopus extends Animal{
	public void Swim() {
		System.out.println("Octopus is swimming");
	}
	
	public void Talk() {
		System.out.println("Octopus is talking ==> gologolo");
	}
}


public class Zoo {
	
	public static void main(String[] args) {
		Tiger tiger1 = new Tiger();
		Tiger[] Tigers = {tiger1, new Tiger()};
		
		Octopus          octopus1 = new Octopus();
	//reference type   object name   object itself
		Octopus [] octopus = {octopus1, new Octopus()};// we can store by object name or object itself
		
		Animal        animal1 =        new Tiger();
//   reference type  reference name    
		Animal animal2 = new Octopus();
		
		animal1.Talk();		
		animal2.Talk();
		
		
		
	}

}
