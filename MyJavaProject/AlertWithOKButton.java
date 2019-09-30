import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement; 



public class AlertWithOKButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
	     
	     WebDriver driver = new ChromeDriver();
	     				
       driver.get("http://demo.automationtesting.in/Alerts.html/");
		
	   
       
       
       
	}

}
