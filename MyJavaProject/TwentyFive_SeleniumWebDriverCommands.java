
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;   //Web element is an interface
import org.openqa.selenium.By;
import java.util.List;


public class TwentyFive_SeleniumWebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
	     
	     WebDriver driver = new ChromeDriver();     // 1st command
	
    driver.get("http://google.co.in");     // 2nd command
    
    String Strtitle = driver.getTitle();  // 3rd command
	 
    System.out.println("Page Title is:" +Strtitle );
    
    String currentUrl = driver.getCurrentUrl();  // 4th command
    System.out.println("Current URL is : " +currentUrl);
	
    
    System.out.println("Page Source = " +driver.getPageSource());  // 5th command
    
    driver.navigate().to("http://www.facebook.com");
    
       
    driver.navigate().back();    // 6th command
    
    
    driver.navigate().forward();  // 7th command 
    
    driver.navigate().refresh();  // 8th command
    
    
 // code to demonstrate usage of findElements. Locate searchBox and enter text in it and then clear it
    driver.navigate().to("http://google.co.in");
    
    
    WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));     // By.name and findElement are methods
 		
 		 searchBox.sendKeys("Packt Publishing");  //9th command 
 		
 		 searchBox.submit();
        
    driver.findElement(By.xpath("//input[@name='q']")).clear();  // 10th command  -> to clear the value of any text element
    
    
    
    driver.navigate().to("http://www.facebook.com");
    driver.findElement(By.linkText("Create a Page")).click();  // 11th command to click on a web link
    
    driver.navigate().back();
    
    boolean isDisplayed = driver.findElement(By.linkText("Create a Page")).isDisplayed();
    
    System.out.println("is it displayed on web page :" +isDisplayed);
	
    boolean is_enabled = driver.findElement(By.linkText("Create a Page")).isEnabled();  // 12th command to check if the element is enabled
    
    System.out.println("is it enabled on web page :" +is_enabled);
    
	// driver.findElement(By.id("Submit")).submit();   13th command to submit the form
    
    
  //  String mytext = driver.findElement(By.cssSelector("#u_0_19")).getText(); 14th command // get the text from a web element
    
    String mytext = driver.findElement(By.name("websubmit")).getText();
    
    System.out.println("The value of text is : " +mytext); 
    
    
    //<a href="/pages/create/?ref_type=registration_form" class="_8esh" style="" xpath="1">
    //Create a Page
    // </a>    Here we need to idenify link Create a page using the tag name "a"  in <a  </a>
	
    WebElement strTag = driver.findElement(By.tagName("a"));  // 15th command to get the tag name of the web element 
    
    System.out.println("The value of tag Name  is : " +strTag); 
    
    // 16th commannd to get the loaction of the web element
    
//    WebElement name = driver.findElement(By.id("Name"));
  //  Point point = name.getLocation();
    //String strLine = System.getProperty("line.separator");
   // System.out.println("X cordinate# " + point.x + strLine + "Y cordinate# " + point.y);
    
    
    
    driver.quit();
    
    
	}
}
