package day43_JavaRecap;

public class Login {
	
	public static void main(String[] args) {
		
		Credentials obj = new Credentials();
	//	obj.username = "Fatih"; //instance variable username is private
	//	obj.password = "Churina"; //private
		
	//	System.out.println(obj.username);
	//	System.out.println(obj.password);
		
		//read private data we need to call getter
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());
		
		
		//modify private data we need call setter
		obj.setUsername("Nurzat");
		obj.setPassword("nshaltaeva");
		
		//to read the private data again we need call one more time getter
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());
		
		
		
		
		
		
		
	}

}
