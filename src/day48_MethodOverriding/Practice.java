package day48_MethodOverriding;

class WebDriver{
	
	public void get() {
		System.out.println("Opens browser");
	}
	
}

class ChromeDriver extends WebDriver{
	
	public void get() {
		System.out.println("Opens Chrome browser");
	}
	
}

class FireFoxDriver extends WebDriver{
	
	public void get() {
		System.out.println("Opens FireFox browser");
	}
}

public class Practice {
	
	public static void main(String[] args) {
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get();
		
		FireFoxDriver driver2 = new FireFoxDriver();
		driver2.get();
	}

}
