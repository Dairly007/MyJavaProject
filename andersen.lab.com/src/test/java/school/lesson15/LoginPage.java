/*
package school.lesson14;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage
{
	public static LoginPage loginPage;
	public static MainPage mainPage;
	public static WebDriver driver;

	@BeforeEach
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
		driver = new ChromeDriver();
		MainPage mainPage = new MainPage(driver);
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
		loginPage.sumbit(LoginPage.accountField);
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

	@AfterAll
	public void tearDown(){
		driver.quit();
	}
}
*/
