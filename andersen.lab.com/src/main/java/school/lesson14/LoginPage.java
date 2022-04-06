package school.lesson14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	protected static WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@class='resplash-btn resplash-btn_primary resplash-btn_mailbox-big svelte-prwih']")
	protected WebElement clickLoginLocator;

	@FindBy(xpath = "//input[@placeholder='Account name']")
	protected static WebElement accountField;

	@FindBy(xpath ="//input[@placeholder='Password']" )
	protected static WebElement passwordField;

	@FindBy(xpath = "//iframe[@class='ag-popup__frame__layout__iframe']")
	protected static WebElement loginFrameLocator;

	public void setFrameDefault(){
		driver.switchTo().defaultContent();
	}

	public LoginPage switchToFrame(WebElement loginFrameLocator){
		driver.switchTo().frame(loginFrameLocator);
		return new LoginPage(driver);
	}

	public LoginPage enterEmail(String email){
		switchToFrame(loginFrameLocator);
		accountField.sendKeys(email);
		accountField.submit();
		return this;
	}
	public LoginPage enterPassword(String password){
		passwordField.sendKeys(password);
		return this;
	}
	public LoginPage submit(WebElement field){
		field.submit();
		return new LoginPage(driver);
	}

	public static LoginPage loginPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConfProperties.getProperty("loginPage"));
		LoginPage loginPageFactory = PageFactory.initElements(driver,LoginPage.class );
		loginPageFactory.switchToFrame(loginFrameLocator);
		Thread.sleep(5000);
		loginPageFactory.enterEmail(ConfProperties.getProperty("email"));
		Thread.sleep(5000);
		loginPageFactory.enterPassword(ConfProperties.getProperty("pass"));
		Thread.sleep(5000);
		loginPageFactory.submit(passwordField);
		Thread.sleep(5000);
		return new LoginPage(driver);
	}
}