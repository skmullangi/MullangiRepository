
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;   //Web element is an interface
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

public class Finding_webElements {

	
	 public static void main(String[] args) {
		 
		 String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
	     
	     WebDriver driver = new ChromeDriver();
	
     driver.get("http://google.co.in");
	 
     
	 
	 // code to find the buttons google search and I am feeling lucky
	WebElement btnGSearch = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")); 
	System.out.println("button 1 : " + btnGSearch.getAttribute("value"));     
	
	
	WebElement btnFLucky = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnI']")); 
	System.out.println("button 2 : " + btnFLucky.getAttribute("value"));     
	
		
	// code to demonstrate usage of findElements. Locate searchBox and enter text in it and click on search
		 WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));     // By.name and findElement are methods
		
		 
		 
		 System.out.println("font used on search button:" +searchBox.getCssValue("font-family"));  // getCssValue method is used to validate Css styles
		 System.out.println("font used on search button:" +searchBox.getCssValue("background-color"));  // getCssValue method is used to validate Css styles
		
		 
		 System.out.println("Location is " +searchBox.getLocation()); // to get the location of the search box on google page
		 
		 
		 searchBox.sendKeys("Packt Publishing");
		 
		 // searchBox.sendKeys(Keys.chord(Keys.SHIFT,"packt publishing")); // to put the text in upper case 
		
   	 // searchBox.clear(); // to clear the text box contents
			
		 
		 searchBox.submit();   //So when you use the submit() method on a WebElement, make sure it is part of the form element
		
	 
	//code to demonstrate List by using findElements
    driver.get("http://demo.guru99.com/test/ajax.html");
	
    List<WebElement> elements = driver.findElements(By.name("name"));
	     
     
	     System.out.println("Number of radio buttons :" +elements.size());

	     for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	      
	     // System.out.println(elements.get(i).isSelected());  // to check is the search box is selected ; works only on radio button
	  	
	      
	   }
  
	     driver.close();
		 
	     driver.quit();
 }
	 
	 
	
}
