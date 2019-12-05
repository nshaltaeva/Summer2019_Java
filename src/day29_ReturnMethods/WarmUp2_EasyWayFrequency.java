package day29_ReturnMethods;

public class WarmUp2_EasyWayFrequency {
	
public static void main(String[] args) {
	
	String str = "AABBCCDD";
	
	String ExpectedResult = "";
	
	
	
	for (int j =0; j < str.length();j++) {
		int count =0;
	for(int i=0; i <str.length(); i++) {
		if (str.charAt(i) == str.charAt(j)) {
			count++;
		}
	}
	ExpectedResult += ""+str.charAt(j)+count;
	str = str.replace(""+str.charAt(j),""); //try with replaceFirst
	}
	System.out.println(ExpectedResult);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
