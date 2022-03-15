package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserAmaz {

	
	public static WebDriver launchChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "G:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		}
		
		public static WebDriver launchEdgeBrowser() {
			
			System.setProperty("webdriver.edge.driver", "G:\\Selenium\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			return driver;
			}
		
}
