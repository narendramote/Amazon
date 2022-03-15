package package123;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pack12.Utility;
import packamaz.AmazonAddToCart;
import packamaz.ApplicationPageHeader;
import packamaz.LogInAmaz;
import packamaz.LogOutAmaz;

public class TestAmaz {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		
		
	/*	LogInAmaz logInAmaz = new LogInAmaz(driver);
		
		logInAmaz.moveToElementAccountsAndList();
		
		Thread.sleep(3000);
		
		logInAmaz.clickOnSignIn();
		
		Thread.sleep(3000);
		
		
		logInAmaz.clickSignInEmailId();
		
		Thread.sleep(3000);
		
		logInAmaz.ClickonContinueButton();
		
		Thread.sleep(3000);
		
		logInAmaz.SendPassword();
		
		Thread.sleep(3000);
		
		logInAmaz.ClickonsubmitButton();
		
		Thread.sleep(3000);
	
		
		
		
		
		
		
		ApplicationPageHeader applicationPageHeader = new ApplicationPageHeader(driver);
		
		applicationPageHeader.clickOnAmazon();
		
     	applicationPageHeader.clickOnSelectYourAddress();
		
		driver.navigate().back();
		
		applicationPageHeader.clickOnAll();
		
		applicationPageHeader.clickOnSearchField();
		
		applicationPageHeader.clickOnSearchButton();
		
		applicationPageHeader.clickOnAccountAndList();
		
		driver.navigate().back();
		
		applicationPageHeader.clickOnReturnsAndOrders();
		
		driver.navigate().back();
		
		applicationPageHeader.clickOnAddToCart();
		
		driver.navigate().back();
		
	
		
		
		
		
		AmazonAddToCart amazonAddToCart = new AmazonAddToCart(driver);  // ADD TO CART MOBILE
		
		amazonAddToCart.clickOnSearchBar();
		
		
		amazonAddToCart.clickOnSearch();
		
		amazonAddToCart.clickOnMobileImage();
		
		ArrayList<String> adress = new  ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(adress.get(1));
		
		Thread.sleep(5000);
		
		amazonAddToCart.clickOnAddToCart();
		
	    Thread.sleep(5000);
	    
    	ArrayList<String> address01 = new ArrayList<String>(driver.getWindowHandles());
    	
    	driver.switchTo().window(address01.get(0));
    	
		amazonAddToCart.clickOnAddToCartSymbol();
		
		ArrayList<String> address02 = new ArrayList<String>(driver.getWindowHandles());
		
    	driver.switchTo().window(address02.get(0)); 
    	
    	driver.navigate().back();
		
    	
    	Thread.sleep(5000);
    	
    	LogOutAmaz logOutAmaz = new LogOutAmaz(driver);
		
    	logOutAmaz.clickonAll();
    	
    	Thread.sleep(3000);
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	
    	js.executeScript("window.scrollBy(0,1000)");
    	
    	logOutAmaz.clickOnSignOut();
    	
    	Thread.sleep(5000);
    	
		
		
		
		System.out.println("done");*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
