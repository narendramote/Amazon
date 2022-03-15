package packamaz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutAmaz {
	
	@FindBy(xpath= "//a[@id='nav-hamburger-menu']")
	private WebElement all;
	
	@FindBy(xpath= "//a[text()='Sign Out']")
	private WebElement signOut;
	
	private WebDriver driver;
	
	public LogOutAmaz(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	public void clickonAll()
	{
		all.click();
	}
	
	public void clickOnSignOut()
	{
		
		signOut.click();
	}
	

}
