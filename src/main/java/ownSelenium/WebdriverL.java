package ownSelenium;

public interface WebdriverL extends PriorWebdriver{
	
	public void get(String URL);
		
	public void getText(String text);
	
	public void findElement(String locatror);
	
	public void close();

}
