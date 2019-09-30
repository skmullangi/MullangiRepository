import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
	     
	     WebDriver driver = new ChromeDriver();
	     				
        driver.get("http://demo.guru99.com/test/drag_drop.html");					
        
		//Element which needs to drag.    		
       	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        
     //  	String G = driver.findElement(By.xpath("//*[@id='credit2']/a")).getText();	
        
       //	System.out.println("the element is " +G);
       	
        //Element on which need to drop.		
        WebElement To=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));	
        
    	    	
        //Using Action class for drag and drop.		
        Actions act=new Actions(driver);					

	//Dragged and dropped.		
        act.dragAndDrop(From, To).build().perform();	
		 
        
        
        
	}

}
