import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

import java.util.List;

public class RadioButton_and_CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		
		
		
		// Navigate to the URL
		driver.get("http://demo.guru99.com/test/ajax.html");
	      
	      // Store all the elements of the same category in the list of WebLements.
	      List<WebElement> mylist = driver.findElements(By.name("name"));

	      mylist.get(0).click();
	      
	      // Create a boolean variable to store true/false.
	      Boolean is_selected = mylist.get(0).isSelected();

	      // If 'is_selected' is true that means the first radio button is
	      // selected.
	      if (is_selected == true) {

	         // If the first radio button is selected by default then,
	         // select the second radio button.
	         mylist.get(1).click();;

	      } else {

	         // If the first radio button is not selected then, click the first
	         // radio button.
	         mylist.get(0).click();
	      }
	      
	      // demonstration of checkbox
	      
	   // Navigate to the URL
			driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		     
			List<WebElement> mycheckBox = driver.findElements(By.name("color"));
			
			int noofChkbox = mycheckBox.size();
			Boolean is_checked = mycheckBox.get(0).isSelected();

		      // If 'is_selected' is true that means the first radio button is
		      // selected.
		      if (is_checked == false) {

		         // If the first radio button is selected by default then,
		         // select the second radio button.
		         mycheckBox.get(0).click(); // check the first checkBox
		      } 

		      
		      mycheckBox.get(0).click();  // deselecting the first chk box
		      
		      // code to select all the check boxes
 
		      for(int i=0;i<noofChkbox;i++)
		      {
		    	  mycheckBox.get(i).click();
		    	  System.out.println("the choeck box selected = " +mycheckBox.get(i).getAttribute("value") );
		     }
		      
		      driver.quit();
	   }

		
}
