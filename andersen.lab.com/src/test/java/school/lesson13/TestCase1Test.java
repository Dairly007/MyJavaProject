package school.lesson13;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static school.lesson13.TestCase1.financialServices;

class TestCase1Test
{
	private static WebDriver driver;

	@BeforeClass
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().getCookies();
		driver.manage().window().maximize();
		driver.get("https://andersenlab.com/");
	}

	@Test
	public void checkSuppWindow()
	{
		driver = new ChromeDriver();
		driver.manage().getCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://andersenlab.com/");
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
	}

	@AfterClass
	public static void tearDown()
	{
		driver.quit();
	}


}