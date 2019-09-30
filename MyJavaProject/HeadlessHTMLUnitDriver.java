//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHTMLUnitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
	     
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
	driver.get("http://www.google.co.in");
	
	System.out.println("Title of page =" +driver.getTitle());
	
	System.out.println("Current URL=" +driver.getCurrentUrl());
	
	
	}

}
