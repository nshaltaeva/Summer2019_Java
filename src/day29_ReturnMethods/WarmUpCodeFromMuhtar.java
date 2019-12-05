package day29_ReturnMethods;

public class WarmUpCodeFromMuhtar {
    /*
    Warm up:
   1. write a method that can find the frequency of characters in String.
   Ex: 
       FrequencyTest("XXXYYYZZZ")
       output: X3Y3Z3
       FrequencyTest("AAABBBBBCCCC")
       output: A3B5C4
       
    */
   public static void main(String[] args) {
       
       String str = "aabbaaabbbcccccDDaaEEE";
       
           //    expected result:   a5b5c5D2
               // letters:  "abcd"
       
       String RemoveDup = "";  // to store the non duplicated values of the str
       for(int i=0; i < str.length(); i++) {
           if( ! RemoveDup.contains( str.substring(i, i+1)) ) {
               RemoveDup += str.substring(i, i+1);
           }
       }
       
       System.out.println(RemoveDup);
       
       //    str = "aabbaaabbbcccccDD";     RemoveDup = "abcd";
                                             //          j, j+1
                                                   
       //           (1, 2)
       //           result = a5b5c5D2
       
       String result ="";  // to store the expected result
       
       
   for(int j=0; j < RemoveDup.length(); j++) {
       int count =0;  // count the numbers of apperances
       for(int i=0; i < str.length(); i++) {
           if( str.substring(i, i+1).equals( RemoveDup.substring(j, j+1)) ) {
               count++;
           }
       }
           result += RemoveDup.substring(j, j+1) + count;
           
       }
           
           System.out.println(result);
           
   System.out.println("=============================================");
   
   
   String input = "XXXYYYZZZ";
   //exprcted result:        "X3Y3Z3"
   //letters: "XYZ"
   
   String nonDuplicates = "";//remove the duplicate from input, and store it here
   // "X" 
   for(int i = 0; i < input.length(); i++) {
	   if (! nonDuplicates.contains(""+input.charAt(i))) {//if does not contain nonDupl in the input thats why we use "!"
	   nonDuplicates += ""+input.charAt(i);
	   
	   }
	  }
   System.out.println(nonDuplicates);
   
   //input = "XXXYYYZZZ;  nonDuplicates = "XYZ"
   // expected result  = "X3Y3Z3";
   
   
   int times = 0; //count the occurrence of X
   String ExpResult = "";
  for(int j=0; j<nonDuplicates.length(); j++) {
   for(int i=0; i <input.length();i++) {
	   if(input.substring(i, i+1).equals(nonDuplicates.substring(j, j+1))) {
		//input.charAt(i) == nonDuplicates.charAt(j); //with charAt method
 		   times++;
	   }
   }
   ExpResult += nonDuplicates.substring(j, j+1) + times;
   				//""+nonDuplicated.charAt(j)
   }
  System.out.println(ExpResult);
   
   System.out.println("===========my solition========");
   
   String str1 = "sssvvvhhhhhsssm";
   
   String dupl = "";
   
   for(int i=0; i <str1.length(); i++) {
	   if (! dupl.contains(str1.substring(i, i+1))) {
		 dupl += str1.substring(i, i+1); 
	   }
   }
   System.out.println(dupl);
   
   int itimes = 0;
   String ExpResult1 ="";
   for(int i=0; i <str1.length();i++) {
	   if (str1.substring(i, i+1).equals("s")) {
		   itimes++;
	   }
   }
   System.out.println(itimes);
  ExpResult1 += "s"+itimes;
  System.out.println(ExpResult1);
   
   
   
   
       
   }
}
