package school.lesson14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
	protected WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@class='resplash-btn resplash-btn_primary resplash-btn_mailbox-big svelte-prwih']")
	private WebElement clickLoginLocator;

	@FindBy(xpath = "//input[@placeholder='Account name']")
	private WebElement accountField;

	@FindBy(xpath ="//input[@placeholder='Password']" )
	private WebElement passwordField;

/*	@FindBy(xpath = "//iframe[@class='ag-popup__frame__layout__iframe']")
	private static WebElement loginFrameLocator;

	public LoginPage setFrame(WebElement loginFrameLocator){
		driver.switchTo().frame(loginFrameLocator);
		return this;
	}*/
	public LoginPage enterEmail(String email){
		accountField.sendKeys(email);
		accountField.submit();
		return this;
	}
	public LoginPage enterPassword(String password){
		passwordField.sendKeys(password);
		passwordField.submit();
		return this;
	}
	public Main sumbitLogin(){
		passwordField.submit();
		return new Main(driver);
	}
}
