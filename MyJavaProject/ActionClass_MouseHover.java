import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement; 

public class ActionClass_MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
	     
	     WebDriver driver = new ChromeDriver();
	     
	     

	     
	     driver.get("http://demowebshop.tricentis.com/login");
		
       WebElement Computers = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
        
        ////ul[@class='top-menu']//a[contains(text(),'Desktops')]
        
       WebElement Desktops = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
       
            
        Actions Act = new Actions(driver);
        
	//	Act.moveToElement(Computers).build().perform();   // Mouse Hover on Computers
	//	Act.moveToElement(Desktops).click().build().perform(); // Click on desktops
      
		Act.moveToElement(Computers).moveToElement(Desktops).click().build().perform();
		
		
		String S = driver.findElement(By.xpath("//strong[contains(text(),'Filter by price')]")).getText();
        
		System.out.println("the Reqd text = " +S);
		
		
		/// Code to right lick on mouse and select option
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		 WebElement rtclickbutton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	      
		
		 Actions Act2 = new Actions(driver);
	
		 Act2.contextClick(rtclickbutton).build().perform(); // perform rt click
		 
		 driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']//span[contains(text(),'Copy')]")).click();;
		 
		 String AlertText = driver.switchTo().alert().getText();
		 
		 System.out.println("Alert Box msg = " +AlertText);
		 
		 
	}

}
