package day21_WhileLoops;

import java.util.Scanner;

public class WhileLoops {
	/*
	 while(condition) {
	 		statements;
	 }
	 
	 while loop gets executed as long as the condition is true
	 
	 a repeating if statement
	 
	 */
	public static void main(String[] args) {
		
		int a=9;
		while (a>8) {
			
			System.out.println("Hello"+a);
			a--;
		}
		
		
		/*
		 1. write a java program that can count how many time
		 the word "book" is appeared in a String 
		 Ex: input: I like books, I have books, I need book
		 output: 3
		 */
		
		String sentence = "I like book,I read book, book book";
		int count = 0;
		while (sentence.contains("book")) {
			count++;
			sentence = sentence.replaceFirst("book", "");
		}
		System.out.println(count);
		
        
        
        
        /*
         1. write a java program that can count how many time the word 
             "book" is appered in a String
         */
        
        String sentence1 ="I like book, I read book, book book book";
        //                  "I like , I read book"
        //                  "I like , I read"
        int  count1 = 0;// 1 + 1
        
        
        while( sentence1.contains("book") ) {
            count1++;
            sentence1 = sentence1.replaceFirst("book", "");  
                // can eventually make the condition false
        }
        
        System.out.println( count1 );
        System.out.println( sentence1 );
        
        
        
        while(true) {
            
            System.out.println("hello");
            break;  // forcefully exits the loop
            
        }
        
        
            int i = 0;
        while ( true ) {
            i++;
            System.out.println("Hello: "+i);  // hello 1
            if(i == 5) {
                break;
            }
            
        }
        
        /*
         use while loop to print all even number between 1-100
         
         */
        
        for(int z=1; z <= 100; z++) {
            if(z%2==0) {
                System.out.print(z+" ");
            }
        }
        
        System.out.println();
        /*
          converting for loop to while loop:
                Initialization;
                    while(condition){
                        statements;
                        iterator;
                    }
         */
        
            int x = 1;
            while(x <= 100) {
                if(x%2==0) {
                    System.out.print(x+" ");
                }
                
                x++;
            }
        
            System.out.println();
        
           
            
            
            
        Scanner scan = new Scanner(System.in);
        System.out.println("Starting number");
        int start = scan.nextInt(); // 10
        
        System.out.println("ending number");
        int end = scan.nextInt();  // 100
    
        /*
        for(int j = start ;  j <= end ; j++ ) {
            if(j %2 == 0 ) {
                System.out.print(j+" ");
            }
        }
            */
        
        int j = start;
        while(j <= end) {
            if(j %2 == 0 ) {
                System.out.print(j+" ");
            }
            j++ ;
        }
            
    System.out.println("\n");
		int a1=0;
		while (a1 <= 6) {
			a1 += 2;
			
		}
		System.out.println(a1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
