import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;   //Web element is an interface
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class HandlingBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
	     
	     WebDriver driver = new ChromeDriver();
	
	     driver.get("http://demo.automationtesting.in/Windows.html");

	     driver.manage().window().maximize();
		
	     driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]"));
	     
	     driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
	     
	     System.out.println(driver.getTitle());
		
	     Set <String> s = driver.getWindowHandles();
	     
	     for(String i:s)
	     {
	    	 String t = driver.switchTo().window(i).getTitle();
	    	 
	    	 System.out.print("window name =  " +t);
	    	 
	    	 System.out.println("  window ID = " +i);
	    	 
	    	 if(t.contains("Sakinalium | Home"))
	    	 {
	    		 driver.close();
	    	 }
	    	 
	     }
 	   
	     
	     
	     
	}

}
