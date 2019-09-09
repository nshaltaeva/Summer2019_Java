package day05_Recap;

public class Concatenation {

			public static void main(String[] args) {
				
				/*
				 String: represents the sequences of characters, used for 
				 storing text
				 String values are surrendered by a double quote
				 
				 Concatenation: combining, linking things together
				 
				 we can concate any value to String
				 
				 */
				
				String str = "any text goes here";
				System.out.println(str);
				
				String str1 = "1";
				System.out.println(str1);//1 as a text
				
				String Hello = "Hello World";
				System.out.println(Hello);
				
				String myName = "Cybertek" + " School";
				System.out.println(myName);
				
				String Year = "This is " + 2019;
				System.out.println(Year);
				
				//example
				String name = "Nurzat";
				System.out.println("My name is "+name);
				
				/*
				 cucumber is 3 $
				 tomato is 5 $
				 */
				int cucumber = 3; int tomato = 5;
				
				System.out.println("cucumber is "+cucumber+'$');
				System.out.println("tomato is "+'$'+tomato);
				
				//System.out.println("Total are "+ cucumber+tomato);
				
				String newStr = "100"+10;
				System.out.println(newStr);//10010
				
				System.out.println(1+2+3);//6
				
				System.out.println("1"+2+3);//"12"+3==>123 text
				
			////	System.out.println("1"+1-3);//"11"-3 gives error because its text
				
				System.out.println("Batch 12"+1+2);//"Batch121"+2 =>Batch1212
				
				System.out.println(2-1+1+"4");//1+1+"4" = 2+"4" => 24
				
				System.out.println("Batch12" + (1+2)); //"Batch 12" +3 => Batch123
				
				System.out.println(1+ "123" +4 +5);//"1123"+4+5=>112345
				
				System.out.println("123"+(4+5));//1239
				
				System.out.println(1+ ("1"+2));//112
				//1+"12" => 112
				
				System.out.println(4+3-(9+3)); //7-12 => -5
				
				System.out.println((1+2)+"3");//33
				
				System.out.println((1*2)+3);//5
				
			//	System.out.println((1+2) - "3"); //3-"3" gives error, you cannot substruct text
				
				String BookName = "I like the book called \' Game of Throne\'";
				System.out.println(BookName);
				
				String MyInfo = "My name is: \n\tCybertek";
				System.out.println(MyInfo);
				
				System.out.println('3'+3);//51 from ASCII + 3 ==>54
				System.out.println("3"+3);//33
				System.out.println("3"+'3');// "3"+3 ==>33
				//if we concate char to String, char is concated as character
				System.out.println(12+'3');//12+51
				//if we concate char to number representive number of char 
				
				System.out.println('7'+3);
				//				55+3
				
				System.out.println('7'+ "3"); 
				System.out.println('7' + 9);
				
				System.out.println('5'+'6'+ "3");//53+54+"3"
				
				
				
				
				
				
				
				//"3"+51
				
				
				
				
			}
	
	
}
