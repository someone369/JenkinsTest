package own;

public class TestClass {

	public static void main(String[] args) {
		
		WebdriverL  driver = new ChromeDriveL();
		driver.get("www.google.com");
		driver.getTitle("Google");
		
		int i = 10;
		System.out.println(i);
		 i = 20;
		 System.out.println(i);
	}

}
