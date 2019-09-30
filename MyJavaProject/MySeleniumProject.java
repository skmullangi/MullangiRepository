import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumProject {
	
		 public static void main(String[] args) {
			 
	 //String exePath = "C:\\Users\\GSR\\Downloads\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe";

	     String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 
	     System.setProperty("webdriver.chrome.driver", exePath);
//	 	System.setProperty("webdriver.ie.driver", exePath); 
		 
	     
	  // Instantiate a IEDriver class.       
	     	       // WebDriver driver=new InternetExplorerDriver();  
      
	  // Instantiate a ChromeDriver class.       
		  
	     WebDriver driver = new ChromeDriver();
			// WebDriver driver = new FirefoxDriver();
		 driver.get("http://google.co.in");
		 
			 
		 }
}