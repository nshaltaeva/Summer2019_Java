package day39_JavaReview;

public class CellPhoneObjects {
public static void main(String[] args) {
        
        CellPhone  phone1 = new CellPhone();
            System.out.println( phone1.brand );  // 
            System.out.println( phone1.color );  // 
            System.out.println( phone1.model);   // 
            System.out.println( phone1.price);   //
            System.out.println( phone1.screensize);  //
        
        CellPhone phone2 = new CellPhone("Motorola", 200, "gray", 6.1, "z2 play");
                phone2.getInfo();
        
        CellPhone phone3 = new CellPhone("Nokia", 20, "black", 3, "3330");
                phone3.getInfo();
                
        CellPhone phone4 = new CellPhone("Samsung", 700, "red", 6.1, "GT-I7500");
                phone4.getInfo();
        
        CellPhone[] phones = {phone1, phone2, phone3, phone4 };
        
        // brand of phone3:
        System.out.println( phones[2].brand );
        
        // get info of phone3
        phones[2].getInfo();
                
        
        
                
    }
}
