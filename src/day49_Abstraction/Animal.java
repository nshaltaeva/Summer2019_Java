package day49_Abstraction;

public abstract class Animal {
	
	public abstract void eat();
		
	public abstract void sleep();
	
	public static void main(String[] args) {
		
	}
}

//concrete
class Cat extends Animal{
	
	@Override
	public void eat() {
		System.out.println("cat eats fish");
	}
	
	@Override
	public void sleep() {
		System.out.println("cat sleeps 14 hours");
	}
}


class KingKong extends Animal{
	
	@Override
	public void eat() {
		System.out.println("King Kong eats Humans");
	}
	
	@Override
	public void sleep() {
		System.out.println("King Kong sleeps 5 hours");
	}
}

class Test{
	public static void main(String[] args) {
		
		KingKong KK = new KingKong();
		KK.eat();
		KK.sleep();
		
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
	}
}










