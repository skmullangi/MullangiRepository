import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;   //Web element is an interface

public class HandlingPopUpAuthenticationWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
			 System.setProperty("webdriver.chrome.driver", exePath);
		     
		     WebDriver driver = new ChromeDriver();
		     
		     //  http://username:password@URL
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/download_secure");
		
		String text = driver.findElement(By.xpath("//h3[contains(text(),'Secure File Downloader')]")).getText();
		
		System.out.println("The text is " +text);
		
	}

}
