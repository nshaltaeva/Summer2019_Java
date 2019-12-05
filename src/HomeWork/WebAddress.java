package HomeWork;

import java.util.Scanner;

public class WebAddress {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String URL, Domain = "", EXT="";
		boolean start, end;
		System.out.println("Enter website url");
		URL = in.nextLine();
		
		start = URL.startsWith("www") ;
		end = URL.endsWith(".com") || URL.endsWith(".gov") || URL.endsWith(".org") 
				|| URL.endsWith(".edu") || URL.endsWith(".net");
		if(start) {
			if(end) {
				int extension = URL.length()-3;
				EXT = URL.substring(extension);
				int at = URL.lastIndexOf(".");
				Domain = URL.substring(4,at);
						
			}else {
				System.out.println("Invalid URL");
			}
			
		}else {
			System.out.println("Invalid URL");
		}
		
		System.out.println("Domain: " + Domain);
		System.out.println("Extension: " + EXT);
		
		
	
			
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


