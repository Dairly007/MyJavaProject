package school.lesson15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage
{
	private static WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage.driver = driver;
	}

	@FindBy(xpath = "//button[@class='resplash-btn resplash-btn_primary resplash-btn_mailbox-big svelte-prwih']")
	protected WebElement clickLoginLocator;

	@FindBy(xpath = "//input[@placeholder='Account name']")
	public static WebElement accountField;

	@FindBy(xpath ="//input[@placeholder='Password']" )
	public static WebElement passwordField;

	@FindBy(xpath = "//iframe[@class='ag-popup__frame__layout__iframe']")
	protected static WebElement loginFrameLocator;

	public void setFrameDefault()
	{
		driver.switchTo().defaultContent();
	}

	public LoginPage enterEmail(String email){
		driver.switchTo().frame(loginFrameLocator);
		accountField.sendKeys(email);
		accountField.submit();
		return this;
	}
	public LoginPage enterPassword(String password)
	{
		passwordField.sendKeys(password);
		return this;
	}
	public void submit(WebElement field){
		field.submit();
	}

	public static void loginPage(WebDriver driver) throws InterruptedException
	{
		LoginPage loginPageFactory = PageFactory.initElements(driver,LoginPage.class );
		loginPageFactory
				.enterEmail(ConfProperties.getProperty("email"))
				.enterPassword(ConfProperties.getProperty("pass"))
				.submit(passwordField);
	}
}