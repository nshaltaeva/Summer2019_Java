package day43_JavaRecap;

import day44_AccessModifiers.TestData;
import day44_AccessModifiers.defaultAsseccModifier;

public class Test {
	
static int a;  int b;
    
    long total = 100; // 200,  175
    
    public Test() {
        
        total -= 50;
        
    }
    
    public Test(int total) {
        this();  //  total = 150;
        this.total += total;  // total += 25  ==> 175
    }
    
    {
        total *= 2 ; 
    }
    
    static {
        int total = 20;
        total /= 2;
    }
        
    public static void main(String[] args) {
        
        Test test = new Test(25);
        System.out.println(test.total);
             
        Test obj1 = new Test();
            obj1.b = 10;
            obj1.a = 20;
            
        Test obj2 = new Test(); 
            obj2.b = 30;
            obj2.a = 40;
        
        System.out.println(obj1.b);  // 10
        System.out.println( obj2.b); // 30
        
        System.out.println( obj1.a );  // 20
        System.out.println( a );   // 20
        System.out.println( obj2.a );  // 20
        
        
        System.out.println(TestData.Name);//we can call from different package cuz access modifier is public
        System.out.println(TestData.ID);
   //     System.out.println(TestData.age);//access modifier is default
        
        
        
        defaultAsseccModifier obj = new defaultAsseccModifier();
    //    System.out.println(obj.nameDefault);
		System.out.println(obj.namePublic);
	//	System.out.println(obj.namePrivate);
        
        
        
        
        
        
        
    }
}
