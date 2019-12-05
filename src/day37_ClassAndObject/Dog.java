package day37_ClassAndObject;

public class Dog {
/*
 Dog
    Attributes/data:
            breed, size, age, color, name, gender ...
    actions:
        eat, sleep, bark, play ...
 */
	String Breed;
	String Size;
	byte Age;
	String color;
	String name;
	char Gender;
	String food;
	
	public void getInfo() {
	System.out.println(Breed+ ", "+ Size +", "+ Age+ " y.o., "+color);	
	}
	
	public void eat() {
		System.out.println(name + " is eating " + food);
	}
	
	
	
	
	
	
	
	
}
