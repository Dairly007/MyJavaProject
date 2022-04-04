package school.lesson14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main
{
	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(xpath = "//span[@class='button2__txt']//ancestor::span[@tabindex='570'] ")
	private WebElement mailMenu;
	@FindBy(xpath = "//button[@class='base-0-2-91 primary-0-2-105 auto-0-2-117']")
	private WebElement setComposeInMenu;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "//*[@id='PH_logoutLink']")
	private WebElement logoutLink;

	@FindBy(xpath = "//iframe[@class='ag-popup__frame__layout__iframe'")
	private static WebElement loginFrame;

	protected static String user = "dairlytest@mail.ru";
	protected static String pass = "Qw75912345";

	public Main(WebDriver driver)
	{
		this.driver = driver;
	}

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://e.mail.ru/compose/");
		LoginPage loginPageFactory = PageFactory.initElements(driver,LoginPage.class );
		loginPageFactory.setFrame(String.valueOf(loginFrame));
		loginPageFactory.enterEmail(user);
		loginPageFactory.enterPassword(pass);
		loginPageFactory.sumbitLogin();
		Main mainFactory = PageFactory.initElements(driver, Main.class);
		mainFactory.mailMenu().click();

		Thread.sleep(5000);
	/*	driver.findElement(By.xpath("")).click();*/
	/*	driver.findElement(By.).click();*/
		Thread.sleep(5000);
		driver.quit();
	}
}