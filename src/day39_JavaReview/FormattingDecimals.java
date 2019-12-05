package day39_JavaReview;

import java.text.DecimalFormat;

public class FormattingDecimals {
public static void main(String[] args) {
	
	
	DecimalFormat formatting = new DecimalFormat("0.00");
	
	double b=23.688685848;
	
	//format(double): formats the decimals and returns String value
	
	String num1 = formatting.format(b);
	System.out.println(num1);
	
	double c=45.56789;
	System.out.println(formatting.format(c));
	
	c = Double.parseDouble(formatting.format(c)); //none boxing
	
}
}
