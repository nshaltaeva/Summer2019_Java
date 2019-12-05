package ReplIt;

import java.util.Scanner;

public class BuildRoute2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String start,end;
	
	start = scan.nextLine();
	end = scan.nextLine();
	boolean validPosition = (start.equals("A") || start.equals("B") || start.equals("C") || start.equals("D")) &&
			  (end.equals("A") || end.equals("B") || end.equals("C") || end.equals("D"));
	
  if(validPosition) {	
	  
	if(start.equals(end)) {
		System.out.println(end + " found");
	}else {
		
		for(String a = start; true; ) {
			if(a.equals(end)) {
				break;
			}
			if(a.equals("A")) {
				System.out.print("right");
			}if(a.equals("B")) {
				System.out.print("down");
			}if(a.equals("C")) {
				System.out.print("left");
			}if(a.equals("D")) {
				System.out.print("up");
			}
			
			a = (a.equals("A"))?"B":(a.equals("B"))?"C":(a.equals("C"))?"D":"A";

			if(a.equals(end)) {
				System.out.print(": ");
			}else {
				System.out.print(" > ");
			}
		
		
	}
		System.out.print(end + " found");
	}
  }else {
	  System.out.println("Invalid position entered");
  }
  
}
}
