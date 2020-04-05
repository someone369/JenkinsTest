package ownSelenium;

public class FirefoxdriverL implements WebdriverL{
	
	public FirefoxdriverL(){
		System.out.println("Firefox broeser launched");
	}
	
	public void get(String URL) {
		System.out.println("Url of the page is : "+URL);
	}

	public void getText(String text) {
		System.out.println("Text of the element : "+text);
	}

	public void findElement(String locatror) {
		System.out.println("Locatror created is :"+locatror);
	}

	public void close() {
		System.out.println("This method is closing the browser ;");
	}

	public void getTitle(String title) {
		System.out.println("Title of the page is : "+title);
		
	}
}
