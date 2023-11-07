package week3.day2;

public class Demo {

	public static void main(String[] args) {
		
		// Browser
		Browser browser = new Browser();
		System.out.println("Browser Name : " + browser.browserName);
		System.out.println("Browser Version : " + browser.browserVersion);
		
		// Chrome
		Chrome obj = new Chrome();
		
		obj.openURL();
		obj.closeBrowser();
		obj.navigateBack();
		obj.openIncognito();
		obj.clearCache();
		
		//Edge
		Edge obj1 = new Edge();
		
		obj1.openURL();
		obj1.closeBrowser();
		obj1.navigateBack();
		obj1.takeSnap();
		obj1.clearCookies();
		
		//Safari
		Safari obj2 = new Safari();
		
		obj2.openURL();
		obj2.closeBrowser();
		obj2.navigateBack();
		obj2.readerMode();
		obj2.fullScreenMode();
		
	}

}
