package day59_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class throws_Keyword {
    
    public static void main(String[] args) {
        sleep2(3000);
    //  sleep(3000);  // the method signature contains throws
        
    //  Thread.sleep(4000);
        
        
    //  method1() ;
    //  test();
        
    //      method3();
            
        
    }
    
    
    public static void sleep(long milliSec) throws InterruptedException {
        Thread.sleep(milliSec); 
    }
    
    public static void method1() throws InterruptedException {
        sleep(4000);
    }
    
    
    
    public static void test() throws Exception{
    
            Thread.sleep(3000);     
        
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("Cybertek");   
        
        Thread.sleep(5000);
        
    }
    
    
    public static void sleep2(long milliSec) {
        try {
            Thread.sleep(milliSec);
        }catch(Exception e) { }
        
    }
    
    
    public static void method2() throws InterruptedException, FileNotFoundException{
        Thread.sleep(3000);
        FileInputStream fil = new FileInputStream("");    
    }
    
    public static void method3() throws RuntimeException{
        System.out.println(9/0);
    }
    
    
    
    
}
