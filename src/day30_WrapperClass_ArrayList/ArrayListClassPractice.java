package day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClassPractice {
public static void main(String[] args) {
	
	ArrayList<String> nameList = new ArrayList<>();
	
	//add method:
	nameList.add("Nurzat");
	nameList.add("Apple");
	
	System.out.println(nameList);
			
	//create an ArrayList called StudentNmes
	//Create Scanner object called scan
	Scanner scan = new Scanner(System.in);
	ArrayList<String> studentNames = new ArrayList<>();
	
	while(true) {
	System.out.println("Enter name");
	String name = scan.nextLine();
	studentNames.add(name);
	
	System.out.println("Do you want to add another name?");
	String answer = scan.nextLine().toLowerCase();
	if(!(answer.equals("yes") || answer.equals("no"))) {
		System.out.println("enter only yes/no");
		break;
	}
	if(answer.equals("no")) {
		break;
	}
	
	}
	System.out.println(studentNames);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
