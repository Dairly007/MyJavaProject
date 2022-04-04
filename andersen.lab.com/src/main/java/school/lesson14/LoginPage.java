package school.lesson14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Main
{
	private WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Account name']")
	private WebElement accountField;

	@FindBy(xpath ="//input[@placeholder='Password']" )
	private WebElement passwordField;

	@FindBy(xpath = "//div[@class='container--ItIg4 size_s-" +
			"-2eBQT size_s--3_M-_']//input[@type='text']")
	private WebElement email;

	public LoginPage(WebDriver driver){
		super(driver);
	}
	public LoginPage setFrame(String loginFrame){
		driver.switchTo().frame(loginFrame);
		return this;
	}
	public LoginPage enterEmail(String email){
		accountField.sendKeys(email);  /**/
		return this;
	}
	public LoginPage enterPassword(String password){  /*""*/
		passwordField.sendKeys(password);
		return this;
	}
	public Main sumbitLogin(){
		passwordField.submit();
		return new Main(driver);
	}
}
