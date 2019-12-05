package day44_AccessModifiers;

import static day44_AccessModifiers.TestData.*;



import java.util.Arrays;
// import static day44_AccessModifiers.TestData.Name;
// import static day44_AccessModifiers.TestData.ID;
//                  package name      class name.staticName
public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(Name);
		System.out.println(ID);
		System.out.println(SchoolName);
		
		System.out.println(age);
		
		defaultAsseccModifier obj = new defaultAsseccModifier();
		System.out.println(obj.nameDefault);
		System.out.println(obj.namePublic);
	//	System.out.println(obj.namePrivate);
		
	}

}
