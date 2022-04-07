package school.lesson15;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPageTest
{
	public static MainPage mainPage;
	public static WebDriver driver;

	@BeforeEach
	static void setUp()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("driver"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConfProperties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Description("Some detailed test description")
	@Test
	public void AuthAndSendLetter() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("driver"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConfProperties.getProperty("url"));
		LoginPage loginPageFactory = PageFactory.initElements(driver,LoginPage.class );
		Assert.assertNotNull(LoginPage.accountField);
		loginPageFactory
				.enterEmail(ConfProperties.getProperty("email"))
				.enterPassword(ConfProperties.getProperty("pass"))
				.submit(LoginPage.passwordField);
		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		Thread.sleep(400);
		Assert.assertNotNull(MainPage.enterEmailField);
		mainPage.enterEmailInLetter(driver)
				.clickSend(driver)
				.confirmSend(driver);
		Assert.assertNotNull(mainPage.checkSent);
	}

	@AfterEach
	public void tearDown() {
		LogEntries browserLogs = driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> allLogRows =
				browserLogs.getAll();
		if (allLogRows.size() > 0 ) {
		}
		driver.quit();
	}

}
