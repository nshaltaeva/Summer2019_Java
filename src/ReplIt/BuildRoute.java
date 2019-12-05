package ReplIt;

import java.util.Scanner;

public class BuildRoute {
public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
     
     System.out.println("start point");
     String start = scan.next();
     System.out.println("end point");
     String end = scan.next();
     
     int s=0;
     int e=0;
   if(start.equals(end)) {  System.out.println(end + "found");}
   else {
   
     if(start.equals("A")) {s=0;}
     else if(start.equals("B")) {s=1;}
     else if(start.equals("C")) {s=2;}
     else if(start.equals("D")) {s=3;}
     
     if(end.equals("A")) {e=0;}
     else if(end.equals("B")) {e=1;}
     else if(end.equals("C")) {e=2;}
     else if(end.equals("D")) {e=3;}
    
    if(s>e) {e=e+4;}
    
    
    for( ;s<e;s++) {
        if(s==0) {System.out.print("right");
            if(e-s!=1) {System.out.print(" > ");
            }}
        else if(s==1) {System.out.print("down");
            if(e-s!=1) {System.out.print(" > ");
            }}
        else if(s==2) {System.out.print("left");
            if(e-s!=1) {System.out.print(" > ");
            }}
        else if(s==3) {System.out.print("up");
            if(e-s!=1) {System.out.print(" > ");
             }}
        else if(s==4) {s=s-5; e=e-4;}
    }
    if(s==e) {System.out.println( ": "+end + " found");}
   }


}


}

