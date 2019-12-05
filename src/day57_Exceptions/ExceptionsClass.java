package day57_Exceptions;

public class ExceptionsClass {
    
    // exception
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3};
        
        System.out.println( arr[100] );  // unchecked
        
        
    //      Thread.sleep(1000);   // checked exception
        
        System.out.println("Done");
        
        
    }
}