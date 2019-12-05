package day53_Interface_Continue;

interface B {
    
    void method3();
    
}
public interface Extends_VS_Implements extends  B {
                //  subtype                  supertype
    
    void method1();  // public
    void method2(); // public
    
 // void method3();
    
    // public void method3() { }
    
}
class A  implements Extends_VS_Implements{
    
    public void method1() {
        
    }
    
    public void method2() {
        
    }
    public void method3() {
        
    }
    
}
class C extends A implements Extends_VS_Implements {
    
    
    
}
