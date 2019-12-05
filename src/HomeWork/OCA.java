package HomeWork;

public class OCA {
	
	public static void main(String[] args) {
		
		int ivar = 100;
		double dvar = 123;
		float fvar = 200;
//		ivar=fvar;
		fvar=ivar;
		
		String [][] arr = {{"A","B","C"},{"D","E"}};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j].equals("B")) {
					break;
				}
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println("=======================");
		
		int wd = 0;
		String [] days = {"sun","mon","wed","sat"};
		for(int i=0; i<days.length;i++) {
			switch(days[i]) {
			case "sat":
			case "sun":
				wd -=1;
				break;
			case "mon":
				wd++;
			case "wed":
				wd += 2;
			}
		}
		System.out.println(wd);
		
		
		
		int [] num1 = new int[3];
		int [] num2 = {1,2,3,4,5};
		num1 = num2;
		for(int i=0; i<num1.length;i++) {
			System.out.print(num1[i]);
			}
		System.out.println();
		
		
		int x=100;
		int a= x++;
		System.out.println(a);
		int b= ++x;
		System.out.println(b);
		int c = x++;
		System.out.println(c);
		
	//	int d = (a<b)?(a<c)?a:(b<c)?b:c:c;
	//	System.out.println(d);
		
		
		
	int num = 10;
	add(10);
//	System.out.println(add(10));
		
		
		
	String str1 = "Java";
	String [] str2 = {"J","a","v","a"};
	String str3 ="";
	
	for (int i=0;i<str2.length;i++) {
		str3 += str2[i];
		
	}
	System.out.println(str3);
	boolean b1 = str1==str3;
	boolean b2 = str1.equals(str3);
	System.out.println(b1+" "+b2);
	
	
//	String num11 = args[1];
	//String num22 = args[2];
	//String num33 = args[3];
	//System.out.println(num33);
	
	String strT = "Batch 12";
	strT = strT.trim();
	System.out.println(strT);
	
	int idx=0;
	System.out.println(++idx);
	
	String s = "";
	System.out.println(s.isEmpty());
	
	}
	
	static void add(int num) {
		num=num+10;
	}
	
	
	
	
	

}
