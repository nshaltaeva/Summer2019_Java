package day37_ClassAndObject;

public class DogObjects {
public static void main(String[] args) {
	
	
	Dog dog1 = new Dog();
//	System.out.println(dog1.name); //null
	
	dog1.Breed = "Husky";
	dog1.Age = 3;
	dog1.Size = "small";
	dog1.color = "gray and white";
	dog1.name = "Holly";
	dog1.Gender = 'F';
	dog1.food = "meal";
	
	System.out.println(dog1.Breed);
	
	
	dog1.getInfo();
	
	System.out.println("=====================================");
	Dog dog2 = new Dog();
	dog2.Breed = "Hatiko";
	dog2.Age = 3;
	dog2.Size = "medium";
	dog2.color = "red";
	dog2.name = "Tuzik";
	dog2.Gender = 'M';
	
	dog2.getInfo();
	
	
	dog1.eat();
	
	
	
	
}
}
