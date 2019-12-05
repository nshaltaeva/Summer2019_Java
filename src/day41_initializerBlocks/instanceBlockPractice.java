package day41_initializerBlocks;

public class instanceBlockPractice {
	public String name ="Shirin";  //"Mihray" , "Dinara
    
    
    public instanceBlockPractice(){
        this(10);  // name = "Muhtar";
        name = "Dinara";
    //  this(10);  // constructor call has to be the first step
    }
    
    {
        name ="Mihray";
    }
    
    {
        name = "Hatice";
    }
    
    public instanceBlockPractice(int a) {
            name = "Muhtar";
    }
    
    public static void main(String[] args) {
        
        instanceBlockPractice obj = new instanceBlockPractice();
            obj.name = "Aijamal";
        System.out.println( obj.name );  //Shirin
        
        instanceBlockPractice obj2 = new instanceBlockPractice();
        System.out.println( obj2.name );  // Dinara
        
    
    }



	

}
