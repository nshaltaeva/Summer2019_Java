package day26_ForEach;

import java.util.Arrays;
import java.util.TreeSet;

public class WarmUp {
public static void main(String[] args) {
	
	/*
	  1. write a program that can check if two Strings are 
	  build out of same letters
    Ex: 
        if str1 = "aabbbc";  str2 ="cab";
        output: true
        if str1 ="abcd";  str2 ="abc";
        output: false
	 */
	
	String a = "aabbbc", b= "cabbbac";
	//      a = abc,      b=cab
	//we will remove all dublicated values from "a"
	String a1 = ""; //store all the non duplicated values from "a"
	
	for (int j=0; j<a.length();j++)  //this method is with nested loop
	for (int i=0; i<a.length();i++) {
		if (!a1.contains(a.substring(j, j+1))) {
			a1 += a.substring(j, j+1);
		}
			
	}
	System.out.println(a1);
	//we will remove all duplicated values from "b"
	String b1 = ""; //store all the non duplicated values from "b"
	for(int i=0; i<b.length();i++) { //this is with simple loop
		if(!b1.contains(b.substring(i, i+1))) {
			 //          ""+b.charAt(i)
			b1 += b.substring(i, i+1);
			//      ""+b.charAt(i);
		}
	}
	System.out.println(b1);
	
	
	//a1 = "acb", b1 = "cab"
	char[] ch1 = a1.toCharArray();
	System.out.println(Arrays.toString(ch1));
	
	char[] ch2 = b1.toCharArray();
	System.out.println(Arrays.toString(ch2));
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	System.out.println("========================");
	System.out.println(Arrays.toString(ch1));
	System.out.println(Arrays.toString(ch2));
	
	
	String str1 = Arrays.toString(ch1);
	String str2 = Arrays.toString(ch2);
	
	if(str1.equals(str2)) {
		System.out.println("true, they are same letters");
	}else {
		System.out.println("false, they are contain different letters");
	}
	
	
	// solution 2:
			 String Str1 = "cccccaaaabbbbccc" , Str2 = "cccaaabbb";
			 
			 Str1 = new TreeSet<String>( Arrays.asList( Str1.split(""))).toString();
			 Str2 = new TreeSet<String>( Arrays.asList( Str2.split(""))).toString();
			 
			 System.out.println(Str1.equals(Str2));
				 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
