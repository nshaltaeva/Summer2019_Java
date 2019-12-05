package day20_JavaRecap;

public class ASCII {

public static void main(String[] args) {
	
	//5. print all lower case and upper case alphabets from the ASCII table
	
	/*for(int i1 = 0; i1<=127; i1++) {    
        int character = i1;    
        char ascii = (char) character;
                System.out.println(" "+ascii);
        }
	*/
	//solution 1
	for (int c=65; c<91; c++) {

	    System.out.print((char)c+" ");
	 }
	System.out.println("\n");
	for (int c=97; c<123; c++) {

	    System.out.print((char)c+" ");
	 }
	System.out.println("\n");
	
	//solution 2
	for (char ch = 'a'; ch <= 'z'; ch++) {
		System.out.print(ch+" ");
	}
	System.out.println("\n");
	for (char ch = 'A'; ch <= 'Z'; ch++) {
		System.out.print(ch+" ");
	}
	
	
	/*for (int c=65; c<91; c+=10) {
        for(int i = 0;i < 10; i++)
        {
            System.out.print((char)(c+i) + " ");
        }
        System.out.println("");
    }
	*/
	
	
	
	
	
	
	
	
	
	
	
	
}
}
