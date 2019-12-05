package day58_ExceptionContinue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/*
 WarmUp:
    
    1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
            parameters: double seconds
            return-type: void
        Note: Exceptions MUST be handled within the methods
    2. write a method called "getData" that can retrieve the data from properties files
            parameters: String Key, String FilePath
            return-type: String
        Note: Exceptions MUST be handled within the methods
 */


public class WarmUp {

	public static void Wait(double seconds) {

		
		
		try {
			Thread.sleep((long)seconds*1000); //1 seconds = 1000 milliseconds
			System.out.println("waited for "+seconds+" seconds");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		}
	
	public static String getData(String Key, String Path) {
		String Data = "";
		
		Properties property = new Properties();
	//	String path = "C:\\Users\\nshal\\OneDrive\\Desktop\\Data.properties";
		
		try {
		FileInputStream file = new FileInputStream(Path);
		property.load(file);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		Data = property.getProperty(Key);
		
		return Data;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("my wait method");
		Wait(2.5);
		System.out.println("checking");
		
		
//		String Name = property.getProperty("Name");
//		System.out.println(Name);
		String Age = getData("Age","TestData.properties");//if path in the same project, we don't need full path "C:\\Users\\nshal\\eclipse-workspace\\Summer2019_Java\\TestData.properties" 
		System.out.println(Age);
	}
	
}
