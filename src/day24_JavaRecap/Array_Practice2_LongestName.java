package day24_JavaRecap;

public class Array_Practice2_LongestName {
	public static void main(String[] args) {
		
		String [] names = {"Nurzat", "Asiya", "Katerina", "Vladislav"};
		
		String LongestName = "";
		
		int max= 0;
		for(int i =0; i<names.length; i++) {
			if(names[i].length() >max) {
				max = names[i].length();
				LongestName = names[i];
			}
		}
		System.out.println(max);
		System.out.println(LongestName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
