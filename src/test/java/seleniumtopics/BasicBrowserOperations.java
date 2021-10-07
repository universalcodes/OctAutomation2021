package seleniumtopics;

public class BasicBrowserOperations extends SeleniumBrowserSetup {
	
	public static void basic_browser_operations() throws InterruptedException
	{
		
		
		browsersetup.manage().deleteAllCookies();
		browsersetup.manage().window().maximize();
		Thread.sleep(5000);
		/*
		 * browsersetup.manage().window().fullscreen();
		 */		
	}
	
	
	

}
