package day21_WhileLoops;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
    	/*
        calculator program:
       write a program that asks user user if he/she wants to: *, / , %, - , +
        
        then ask user to enter two number
        
        then return the result to the console
        
        and then ask the user if they wanna continue to do another math
        if yes ==> repeat the previous steps,
        if no ==> exit the system
        other wise ==> ask the user to re enter 
        
        
        
        */
        Scanner scan = new Scanner(System.in);
             System.out.println("Choose your arithmatic operator inputing by signs");
             String calc = scan.next();
             
             if (calc.equals("+"))
                 while(true) {
                     
                     System.out.println("Enter two number");
                     int a = scan.nextInt();
                     int b = scan.nextInt();  // 9 Enter
                     System.out.println("Addition is: " + (a+b));
                     System.out.println("Do you wanna continue?");
                     
                         scan.nextLine();
                      String answer =scan.nextLine().toLowerCase();
                                         
                      while( !( answer.equals("yes")|| answer.equals("no") )  ) {
                          System.out.println("Please make up your mind");
                          System.out.println("Do you wanna continue?");
                             answer =scan.nextLine();
                      }
                  
                      if(answer.equals("no")) {
                          break;
                      }
                 }
             
             if (calc.equals("-"))
                 while(true) {
                     
                     System.out.println("Enter two number");
                     int a = scan.nextInt();
                     int b = scan.nextInt();  // 9 Enter
                     System.out.println("Substruction is: " + (a-b));
                     System.out.println("Do you wanna continue?");
                         scan.nextLine();
                      String answer =scan.nextLine().toLowerCase();
                      
                      while( !( answer.equals("yes")|| answer.equals("no") )  ) {
                          System.out.println("Please make up your mind");
                          System.out.println("Do you wanna continue?");
                             answer =scan.nextLine();
                      }
                  
                      if(answer.equals("no")) {
                          break;
                      }
                 }
             
             if (calc.equals("*"))
            while(true) {
                
                System.out.println("Enter two number");
                int a = scan.nextInt();
                int b = scan.nextInt();  // 9 Enter
                System.out.println("Multiplication is: " + (a*b));
                System.out.println("Do you wanna continue?");
                    scan.nextLine();
                 String answer =scan.nextLine().toLowerCase();
                 
                 while( !( answer.equals("yes")|| answer.equals("no") )  ) {
                     System.out.println("Please make up your mind");
                     System.out.println("Do you wanna continue?");
                        answer =scan.nextLine();
                 }
             
                 if(answer.equals("no")) {
                     break;
                 }
            }
        
        if (calc.equals("/"))
            while(true) {
                
                System.out.println("Enter two number");
                int a = scan.nextInt();
                int b = scan.nextInt();  // 9 Enter
                System.out.println("Division is: " + (a/b));
                System.out.println("Do you wanna continue?");
                    scan.nextLine();
                 String answer =scan.nextLine().toLowerCase();
                 
                 while( !( answer.equals("yes")|| answer.equals("no") )  ) {
                     System.out.println("Please make up your mind");
                     System.out.println("Do you wanna continue?");
                        answer =scan.nextLine();
                 }
             
                 if(answer.equals("no")) {
                     break;
                 }
            }
        
        if (calc.equals("%"))
            while(true) {
                
                System.out.println("Enter two number");
                int a = scan.nextInt();
                int b = scan.nextInt();  // 9 Enter
                System.out.println("Reminder is: " + (a%b));
                System.out.println("Do you wanna continue?");
                    scan.nextLine();
                 String answer =scan.nextLine().toLowerCase();
                 
                 while( !( answer.equals("yes")|| answer.equals("no") )  ) {
                     System.out.println("Please make up your mind");
                     System.out.println("Do you wanna continue?");
                        answer =scan.nextLine();
                 }
             
                 if(answer.equals("no")) {
                     break;
                 }
            }
        
        
    }
}

