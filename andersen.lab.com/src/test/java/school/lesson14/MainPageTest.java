package school.lesson14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPageTest
{
	public static MainPage mainPage;
	public static WebDriver driver;

	@BeforeAll
	public static void setUp()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("driver"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConfProperties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void AuthAndSendLetter() throws InterruptedException
	{
//		LoginPage loginPageFactory = PageFactory.initElements(driver, LoginPage.class);
//		MainPage mainPage = PageFactory.initElements(driver,MainPage.class);
/*		Assert.assertNotNull(LoginPage.loginFrameLocator);
		Assert.assertNotNull(ConfProperties.getProperty("email"));
		loginPage.submit(LoginPage.accountField);
		Assert.assertNotNull(LoginPage.accountField);
		loginPage.enterEmail(ConfProperties.getProperty("pass"));
		Assert.assertNotNull(ConfProperties.getProperty("pass"));
		loginPage.submit(LoginPage.passwordField);
		Assert.assertNotNull(LoginPage.passwordField);

		mainPage.enterEmailInLetter(driver);
		Assert.assertNotNull(ConfProperties.getProperty("email"));
		mainPage.clickSend(driver);
		Assert.assertTrue(mainPage.clickSendLocator.isDisplayed());
		mainPage.confirmSend(driver);
		Assert.assertTrue(mainPage.confirmSendLocator.isDisplayed());*/

/*		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("driver"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConfProperties.getProperty("url"));

		loginPageFactory.enterEmail(ConfProperties.getProperty("email"))
				.enterPassword(ConfProperties.getProperty("pass"))
				.submit(LoginPage.passwordField);
		Thread.sleep(400);

		mainPage.enterEmailInLetter(driver)
				.clickSend(driver)
				.confirmSend(driver);
	*/
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


	@AfterAll
	public static void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
