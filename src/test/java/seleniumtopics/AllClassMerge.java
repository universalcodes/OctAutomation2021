package seleniumtopics;

public class AllClassMerge {

	
	public static void main(String[] args) throws InterruptedException {
		
		SeleniumBrowserSetup.googlechromesetup();
		
		SeleniumBrowserSetup.browsersetup.quit();
		
		
		SeleniumBrowserSetup.firefoxsetup();
		SeleniumBrowserSetup.browsersetup.quit();

		
		/*
		 * SeleniumBrowserSetup.iebrowser_setup();
		 * SeleniumBrowserSetup.browsersetup.quit();
		 */
		 


		SeleniumBrowserSetup.edgebrowser_setup();
		SeleniumBrowserSetup.browsersetup.quit();





		
		
	}
}
