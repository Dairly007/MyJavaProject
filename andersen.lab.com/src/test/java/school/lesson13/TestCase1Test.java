package school.lesson13;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static school.lesson13.TestCase1.financialServices;

class TestCase1Test
{
	private static WebDriver driver;

	@BeforeAll
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().getCookies();
		driver.manage().window().setSize(new Dimension(320,640));
		driver.get("https://andersenlab.com/");
	}

	@Test
	public void checkSuppWindow() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)");
		WebElement toScroll = driver.findElement(financialServices);
		assertNotNull(toScroll, "No such element");
		WebElement helpButton = driver.findElement(By.xpath("//div[@class='Hint-module--iconWrapper--GphH0 Hint-module--modalHint--xs9oi']/child::*"));
		assertNotNull(helpButton, "No such element");
		Actions helpButt = new Actions(driver);
		helpButt.moveToElement(helpButton).click().build().perform();
		WebElement checkWindow = driver.findElement(By.xpath("//div[@class='Hint-module--text--VQjBJ']"));
		assertNotNull(checkWindow);
		Thread.sleep(2000);
	}

	@AfterAll
	public static void tearDown()
	{
		driver.quit();
	}


}