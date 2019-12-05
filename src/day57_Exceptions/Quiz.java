package day57_Exceptions;


interface Fatih{
    
    void readBooks();
    abstract void WatchTV();
    
}
abstract class Omer implements Fatih{
    
    public void readBooks() {
        System.out.println("Omer is reading");
    }
    
    /*
    abstract void WatchTV();
     */
    
    //   <button       name="class"   id="11"   class ="xx"> reading books </button>
    //    tg-name                                             linkedText
}
public class Quiz extends Omer {
    
    // Assessment quiz 14
    
    public void WatchTV() {
        
    }
    
    
}
class parent{
    
}
class child extends parent{
    
    public static void main(String[] args) {
        
        parent obj = new child();
        
        //child objs  = new parent();
        
        
    }
    
}
interface A {
    public int a = 10; //  by default ==> public static final
    
    public static void main(String[] args) {
        System.out.println(a);
    }
    
    
//  public void mm() { }
        
//  interface cannot have: instance methods, instance variables, static block, instance block, constructor
    
    public void n(); 
    
}
