import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

import java.util.List;


public class GoogleSearchByLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//The HTML link elements are represented on a web page using the <a> tag, abbreviation for the anchor tag. A typical anchor tag looks like this:
 // <a href="/intl/en/about.html">About</a>
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("About")).click();
	
		}
	
}

