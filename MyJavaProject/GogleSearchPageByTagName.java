import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

import java.util.List;

public class GogleSearchPageByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <button class="close-button" id="spchx" aria-label="close" xpath="1"></button>  . Here button is enclosed in tags
		//<button </button>
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println(buttons.size());
		
	WebElement searchButton = driver.findElement(By.cssSelector("input.gNO89b"));
			
	System.out.println("Text on button  : " + searchButton.getAttribute("value"));     
		
	}	
	
}
