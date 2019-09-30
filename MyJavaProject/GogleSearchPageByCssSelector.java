import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

import java.util.List;

public class GogleSearchPageByCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println(buttons.size());
		
	WebElement searchButton = driver.findElement(By.cssSelector("input.gNO89b"));
			
	System.out.println("Text on Search button  : " + searchButton.getAttribute("value"));     
		
		
	}

}
