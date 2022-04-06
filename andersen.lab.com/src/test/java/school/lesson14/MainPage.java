package school.lesson14;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static school.lesson14.LoginPage.passwordField;
import static school.lesson14.Main.clickSendLocator;
import static school.lesson14.Main.confirmSendLocator;


class MainPage
{
	public static LoginPage loginPage;
	public static MainPage mainPage;
	public static WebDriver driver;

	public MainPage(WebDriver driver)
	{
		this.driver = driver;
	}


	@BeforeAll
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
		driver = new ChromeDriver();
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);

		driver.manage().getCookies();
		driver.manage().window().maximize();
		driver.get(ConfProperties.getProperty("loginPage"));
	}

	@Test
	public void switchToFrame()
	{
		loginPage.switchToFrame(LoginPage.loginFrameLocator);
		Assert.assertNotNull(LoginPage.loginFrameLocator);
	}

	@Test
	public void enterEmail()
	{
		loginPage.enterEmail(ConfProperties.getProperty("email"));
		Assert.assertNotNull(ConfProperties.getProperty("email"));
		loginPage.submit(LoginPage.accountField);
		Assert.assertNotNull(LoginPage.accountField);
	}

	@Test
	public void enterPasswordAndSubmit()
	{
		loginPage.enterEmail(ConfProperties.getProperty("pass"));
		Assert.assertNotNull(ConfProperties.getProperty("pass"));
		loginPage.submit(passwordField);
		Assert.assertNotNull(passwordField);
	}


	@Test
	public void enterEmailInLetter()
	{
		mainPage.enterEmailInLetter();
		Assert.assertNotNull(ConfProperties.getProperty("email"));
	}

	@Test
	public void clickSend()
	{
		mainPage.clickSend();
		Assert.assertNotNull(clickSendLocator);
	}

	@Test
	public void confirmSend()
	{
		mainPage.confirmSend();
		Assert.assertNotNull(confirmSendLocator);
	}

	@AfterAll
	public static void tearDown(){
		driver.quit();
	}
}
