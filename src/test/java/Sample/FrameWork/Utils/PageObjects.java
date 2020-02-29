package Sample.FrameWork.Utils;
public interface PageObjects {
		/*
		 * Main tab objects
		 */
	String DOWNLOAD_LINK_XPATH = "//a[text()='Downloads']";
	String DOWNLOAD_TEXT_XPATH = "//p[@class='body-large']";
	String PREVIOUS_RELEASES_XPATH = "//p[text()='Previous Releases']";
	String PROJECTS_HEADDE_XPATH = "//a[text()='Projects']";
	
	/**
	 * LOgin for http://automationpractice.com/
	 */
	String AUTOMATIONPRACTICE_SIGN_LINK_XPATH = "//a[@class='login']";
	String AUTOMATIONPRACTICE_SIGNIN_SUBMIT_BUTTIN_XPATH = "//button[@id='SubmitLogin']";
	String AUTOMATIONPRACTICE_USERNAME_EMAIL_XPATH = "//input[@id='email']";
	String AUTOMATIONPRACTICE_PASSWORD_XPATH = "//input[@id='passwd']";
	String AUTOMATIONPRACTICE_HOME_BUTTON = "//a[@title='Return to Home']";

}
