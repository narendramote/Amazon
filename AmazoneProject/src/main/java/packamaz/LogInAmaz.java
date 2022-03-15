package packamaz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInAmaz {
	
	@FindBy(xpath= "//a[@id='nav-link-accountList']")
	private WebElement accountAndList;
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement signInButton;
	
	@FindBy(xpath= "//input[@id='ap_email']"  )
	private WebElement signInEmailId;
	
	@FindBy(xpath= "//input[@id='continue']"  )
	private WebElement continueButton;
	
	@FindBy(xpath= "//input[@id='ap_password']" )
	private WebElement password;
	
	@FindBy(xpath= "//input[@id='signInSubmit']" )
	private WebElement submitButton;
	
	
	private WebDriver driver;
	private Actions actions;
	
	public LogInAmaz(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		actions = new Actions(driver);
	}
		
		
		public void moveToElementAccountsAndList()
		{
			actions.moveToElement(accountAndList).perform();
		}
		public void clickOnSignIn()
		{
			signInButton.click();
		}
		public void clickSignInEmailId(String user)
		{
			
			signInEmailId.sendKeys(user);
		}
		
		
		public void ClickonContinueButton()
		{
			continueButton.click();
		}
		
		public void SendPassword(String pass)
		{
			password.sendKeys(pass);
		}
		
		public void ClickonsubmitButton()
		{
			submitButton.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


