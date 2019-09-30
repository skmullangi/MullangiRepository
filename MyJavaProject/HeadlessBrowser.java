import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
	     
		ChromeOptions Options = new ChromeOptions();
		
		Options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(Options);
		
		driver.get("http://www.google.co.in");
		
		System.out.println("Title of page =" +driver.getTitle());
			
	}

}
