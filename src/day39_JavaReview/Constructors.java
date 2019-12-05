package day39_JavaReview;

public class Constructors {
	 public Constructors() {
	        //this("Hello");
	        System.out.print("Erhan ");
	    }
	    
	    public Constructors(int a) {  // Erhan Ali
	        this(); // Erhan
	        System.out.print("Ali ");  // Ali
	    }
	    
	    public Constructors(double a) {  //  Erhan Ali Shawkrat
	        this(100); // Erhan Ali
	        System.out.print("Shawkrat ");
	        // this(10);      constructor call must be the first step
	    }
	    
	    public Constructors(boolean a) {   //  Erhan Ali Shawkrat Dinara
	        this(2.5);   //  Erhan Ali Shawkrat
	        System.out.print("Dinara ");
	    }
	    
	    
	    public Constructors(String str) {  // Erhan Ali Seyfo
	        this(100); // Erhan Ali
	        // this(true); // one constructor can only ccall one constructor 
	        System.out.print("Seyfo ");
	    }
	    
	    public Constructors(byte a) { // Erhan Ali Seyfo Sabir
	        this("hello"); // Erhan Ali Seyfo
	        System.out.print("Sabir ");
	    }
	    
	    
	    
	    public static void main(String[] args) {
	        
	        Constructors obj = new Constructors( (byte)2 );
	        
	        
	        
	    }   
	        
	    
}
