package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver ;
	
	public static void Driverintiate() {
	System.setProperty("webdriver.chrome.driver", "C:webdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
}
