package day48_MethodOverriding;

class Mahribana{
	
	void methodA() {
		System.out.println("Method A");
	}
	
	protected double salary (double bonus) {
		return bonus+100000;
	}
	
}

public class AccessModifiers extends Mahribana{
	
	@Override
	protected double salary(double bonus) {
		return bonus+20000;
	}
	
	//this is overload method now
	protected double salary(int bonus) {
		return bonus+20000;
	}

	@Override
	 void methodA() { //we can give public access modifier
		System.out.println("Method A");
	}
	/*
	@Override
	private void methodA() {
		System.out.println("Method A");
	}
	override method access modifier need to be same or more visible
	*/
	
}
