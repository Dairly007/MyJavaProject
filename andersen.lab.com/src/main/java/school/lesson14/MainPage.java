package school.lesson14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends LoginPage
{
	private static WebDriver driver;
	private static WebDriverWait wait;

	public MainPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@FindBy(xpath = "//span[@class='layer-sent-page__contact-item']")
	protected WebElement checkSent;

	@FindBy(xpath = "//span[@class='button2__txt']//ancestor::span[@tabindex='570']")
	protected static WebElement clickSendLocator;

	@FindBy(xpath = "//span[contains(text(), '\u041E\u0442\u043F\u0440\u0430\u0432\u0438\u0442\u044C')]")
	protected static WebElement confirmSendLocator;

	@FindBy(xpath = "//div[@class='container--ItIg4 size_s--2eBQT size_s--3_M-_']//input[@type='text']")
	protected static WebElement enterEmailField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "//*[@id='PH_logoutLink']")
	private WebElement logoutLink;

	public MainPage clickSend(WebDriver driver)
	{
		clickSendLocator.click();
		return this;
	}

	public MainPage confirmSend(WebDriver driver){
		confirmSendLocator.click();
		return this;
	}

	public MainPage enterEmailInLetter(WebDriver driver)
	{
		enterEmailField.sendKeys(ConfProperties.getProperty("email"));
		return this;
	}

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("driver"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConfProperties.getProperty("url"));
		LoginPage.loginPage(driver);
		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		Thread.sleep(400);
		mainPage.enterEmailInLetter(driver)
				.clickSend(driver)
				.confirmSend(driver);
		driver.close();
		driver.quit();
	}
}

