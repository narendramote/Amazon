package package123;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.BrowserAmaz;
import pack12.Utility;
import packamaz.ApplicationPageHeader;
import packamaz.LogInAmaz;
import packamaz.LogOutAmaz;

public class TestNGAmaz extends BrowserAmaz{
	private WebDriver driver;
	private LogInAmaz logInAmaz;
	private ApplicationPageHeader applicationPageHeader;
	private LogOutAmaz logOutAmaz;
	private SoftAssert soft;
	String testId;
	
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
		applicationPageHeader = new ApplicationPageHeader(driver);
		logOutAmaz = new LogOutAmaz(driver);
	}
	
	
	
	
	
	
	
		@BeforeMethod
		public void LoginAmaz() throws InterruptedException, IOException,EncryptedDocumentException {
			System.out.println("Log in amazon");

			driver.get("https://www.amazon.in/");
			
			
			//LogInAmaz logInAmaz = new LogInAmaz(driver);
			
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
		public void test456() {
			testId = "101";
			System.out.println("test");
			//ApplicationPageHeader applicationPageHeader = new ApplicationPageHeader(driver);
			
		
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
			
		}
		
		@AfterMethod
		public void LogOut(ITestResult result) throws InterruptedException, IOException {
			
			if(ITestResult.FAILURE == result.getStatus())
			{
			
			Utility.screenshot(driver, testId);
			}
			System.out.println(" Logout");
			//LogOutAmaz logOutAmaz = new LogOutAmaz(driver);
			
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
			logInAmaz =null;
			applicationPageHeader = null;
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
