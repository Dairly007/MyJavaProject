package school.lesson14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main
{
	private final WebDriver driver;

	public Main(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath = "//span[@class='button2__txt']//ancestor::span[@tabindex='570']")
	private WebElement clickSendLocator;

	@FindBy(xpath = "//span[contains(text(), '\u041E\u0442\u043F\u0440\u0430\u0432\u0438\u0442\u044C')]")
	private WebElement confirmSendLocator;

	@FindBy(xpath = "//div[@class='container--ItIg4 size_s--2eBQT size_s--3_M-_']//input[@type='text']")
	private WebElement enterEmailField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "//*[@id='PH_logoutLink']")
	private WebElement logoutLink;

	@FindBy(xpath = "//iframe[@class='ag-popup__frame__layout__iframe'")
	private static WebElement loginFrameLocator;

	protected static String user = "dairlytest@mail.ru";
	protected static String pass = "Qw75912345";

	public Main clickSend()
	{
		clickSendLocator.click();
		return this;
	}

	public Main confirmSend(){
		confirmSendLocator.click();
		return this;
	}

	public Main enterEmailInLetter(String user){
		enterEmailField.click();
		enterEmailField.sendKeys(user);
		return this;
	}



	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.edge.driver", "src/main/resources/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://e.mail.ru/compose/");
		LoginPage loginPageFactory = PageFactory.initElements(driver,LoginPage.class );
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='ag-popup__frame__layout__iframe']")));
	/*	loginPageFactory.setFrame(loginFrameLocator);*/
		Thread.sleep(5000);
		loginPageFactory.enterEmail(user);
		Thread.sleep(5000);
		loginPageFactory.enterPassword(pass);
		Thread.sleep(5000);
		loginPageFactory.sumbitLogin();
		Thread.sleep(5000);
		Main mainFactory = PageFactory.initElements(driver, Main.class);
		mainFactory.enterEmailInLetter(user).clickSend().confirmSend();
		Thread.sleep(5000);
		driver.quit();
	}
}

