package ownSelenium;

public class ChromeDriveL implements WebdriverL{
	
	public ChromeDriveL(){
		
		System.out.println("Chrome broeser launched");
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
		System.out.println("User used this method to close the brower");
	}

	public void getTitle(String title) {
		System.out.println("Title of the page is : "+title);
	}

}
