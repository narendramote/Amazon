package package123;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.BrowserAmaz;
import pack12.Utility;
import packamaz.AmazonAddToCart;
import packamaz.ApplicationPageHeader;
import packamaz.LogInAmaz;
import packamaz.LogOutAmaz;




public class TestNGAmaz2 extends BrowserAmaz {
	
	private WebDriver driver;
	private LogInAmaz logInAmaz;
	private AmazonAddToCart amazonAddToCart;
	private LogOutAmaz logOutAmaz;
	String testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;

	
	
	@BeforeTest
	@Parameters("browser")
	public void LaunchBrowser(String browserName)  {
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		System.out.println("Launch Browser");
	    if(browserName.equals("Chrome"))
		{
		
		    driver = launchChromeBrowser();
		}
		if(browserName.equals("Edge"))
		{
		
		 driver = launchEdgeBrowser();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void createObject() {
		logInAmaz = new LogInAmaz(driver);
		amazonAddToCart = new AmazonAddToCart(driver); 
		logOutAmaz = new LogOutAmaz(driver);
	}
		@BeforeMethod
		public void LoginAmaz() throws InterruptedException, IOException,EncryptedDocumentException {
			System.out.println("Log in amazon");

			driver.get("https://www.amazon.in/");
			
			
		//	LogInAmaz logInAmaz = new LogInAmaz(driver);
			
			logInAmaz.moveToElementAccountsAndList();
			
			Thread.sleep(3000);
			
			logInAmaz.clickOnSignIn();
			
			Thread.sleep(3000);
			
			String user = Utility.getDataFromExcel("Sheet1", 1, 2);
			String pass = Utility.getDataFromExcel("Sheet1", 2, 2);
			
			logInAmaz.clickSignInEmailId(user);
			
			Thread.sleep(3000);
			
			logInAmaz.ClickonContinueButton();
			
			Thread.sleep(3000);
			
			logInAmaz.SendPassword(pass);
			
			Thread.sleep(3000);
			
			logInAmaz.ClickonsubmitButton();
			
			Thread.sleep(3000);
					
					
			
			
		}
		
		@Test
		public void test456() throws InterruptedException {
			testID = "102";
			System.out.println("test");
			//AmazonAddToCart amazonAddToCart = new AmazonAddToCart(driver); 
			
		//	String url = driver.getCurrentUrl();
		//	String title = driver.getTitle();
			
		 //  Assert.assertEquals(url, "https://www.amazon.in/");
		   
		//   Assert.assertEquals(title, false)
			
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
			
		}
		
		@AfterMethod
		public void LogOut(ITestResult result ) throws InterruptedException, IOException {
			
			if(ITestResult.FAILURE == result.getStatus())
			{
			Utility.screenshot(driver, testID);
			}
			System.out.println(" Logout");
		//	LogOutAmaz logOutAmaz = new LogOutAmaz(driver);
			
	    	logOutAmaz.clickonAll();
	    	
	    	Thread.sleep(3000);
	    	
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	
	    	js.executeScript("window.scrollBy(0,1000)");
	    	
	    	logOutAmaz.clickOnSignOut();
	    	
	    	Thread.sleep(5000);
		}
		
		@AfterClass
		public void closeDriver() {
			System.out.println("after class");
			logInAmaz = null;
			amazonAddToCart = null;
			logOutAmaz = null;
			
		}
		@AfterTest
		public void agtertest() {
			System.out.println("aftertest");
			driver.quit();
			driver= null;
			System.gc();
		}

}
