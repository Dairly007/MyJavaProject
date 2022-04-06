package school.lesson14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main
{
	private WebDriver driver;

	@FindBy(xpath = "//span[@class='button2__txt']//ancestor::span[@tabindex='570']")
	protected static WebElement clickSendLocator;

	@FindBy(xpath = "//span[contains(text(), '\u041E\u0442\u043F\u0440\u0430\u0432\u0438\u0442\u044C')]")
	protected static WebElement confirmSendLocator;

	@FindBy(xpath = "//div[@class='container--ItIg4 size_s--2eBQT size_s--3_M-_']//input[@type='text']")
	private WebElement enterEmailField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "//*[@id='PH_logoutLink']")
	private WebElement logoutLink;

	public Main clickSend()
	{
		clickSendLocator.click();
		return this;
	}

	public Main confirmSend(){
		confirmSendLocator.click();
		return this;
	}

	public Main enterEmailInLetter(){
		enterEmailField.click();
		enterEmailField.sendKeys(ConfProperties.getProperty("email"));
		return this;
	}

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromeDriver"));
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConfProperties.getProperty("loginPage"));
		Thread.sleep(5000);
		Main mainFactory = PageFactory.initElements(driver, Main.class);
		mainFactory.enterEmailInLetter().clickSend().confirmSend();
		Thread.sleep(5000);
		driver.quit();
	}
}

