import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement; 

public class SliderOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
	     
	     WebDriver driver = new ChromeDriver();
	     				
        driver.get("https:jqueryui.com/slider/");
		
		driver.switchTo().frame(0); // go to the frame
		
		//Identify the Slider     		
       	WebElement Slider=driver.findElement(By.xpath("//div[@id='slider']"));	
		
		Actions Act = new Actions(driver);
		
		Act.moveToElement(Slider).dragAndDropBy(Slider, 300, 0).build().perform();
		
	}

}
