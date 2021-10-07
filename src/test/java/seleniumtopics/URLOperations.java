package seleniumtopics;

import java.util.concurrent.TimeUnit;

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


}
