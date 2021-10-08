package seleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class URLOperations extends SeleniumBrowserSetup {

	
	public static void url_operations() {
				
		browsersetup.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		browsersetup.get("https://www.google.com/");
	String a = 	browsersetup.getCurrentUrl();
	System.out.println("The Current URL is "+a );
	String b = 	browsersetup.getTitle();
	System.out.println("The Title is "+b );
	
	browsersetup.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	

	/*
	 * String c = browsersetup.getPageSource();
	 * System.out.println("The Current Page Source is "+c);
	 */
	
	System.out.println("All CurrentURL + Title has been fetched in the runnig browser");

	
	
}

	public static void gmailcheckC() {
		browsersetup.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		String gmailurl = "https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser";
		browsersetup.get(gmailurl);
		
		WebElement gmailtest = browsersetup.findElement(By.cssSelector("input[id='identifierId']"));
		gmailtest.sendKeys("yogeshkamra25@gmail.com");
		
		WebElement buttonclick  = browsersetup.findElement(By.className("VfPpkd-vQzf8d"));
		buttonclick.click();
		
		browsersetup.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
	}
	
	

}
