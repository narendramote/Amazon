package packamaz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationPageHeader {
	
	@FindBy(xpath= "//a[@id='nav-logo-sprites']")
	private WebElement amazon;
	
	@FindBy(xpath= "//div[@id='nav-global-location-slot']")
	private WebElement selectYourAddress;
	
	@FindBy(xpath= "//select[@id='searchDropdownBox']")
	private WebElement all;
	
	@FindBy(xpath= "//input[@id='twotabsearchtextbox']")
	private WebElement searchField;
	
	@FindBy(xpath= "//input[@id='nav-search-submit-button']")
	private WebElement searchButton;
	
	@FindBy(xpath= "//a[@id='icp-nav-flyout']")
	private WebElement flag;
	
	@FindBy(xpath= "//a[@id='nav-link-accountList']")
	private WebElement accountAndList;
	
	@FindBy(xpath= "//a[@id='nav-orders']")
	private WebElement returnsAndOrders;
	
	@FindBy(xpath= "//a[@id='nav-cart']")
	private WebElement addToCart;
	
	

	
	
	
	
    private WebDriver driver;
	private Actions actions;
	
	public ApplicationPageHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		actions = new Actions(driver);
	}
	
	public void clickOnAmazon()
	{
		amazon.click();
	}
	
	public void clickOnSelectYourAddress()
	{
		selectYourAddress.click();
	}
	
	public void clickOnAll()
	{
		all.click();
	}
	
	public void clickOnSearchField()
	{
		searchField.sendKeys("mobiles under 10000");
	}
	
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	
	public void clickOnFlag()
	{
		flag.click();
	}
	
	public void clickOnAccountAndList()
	{
		actions.moveToElement(accountAndList).perform();
	}
	
	public void clickOnReturnsAndOrders()
	{
		returnsAndOrders.click();
	}
	
	public void clickOnAddToCart()
	{
		 addToCart.click();
	}
	
	
	
	
	
	
	
	
}
