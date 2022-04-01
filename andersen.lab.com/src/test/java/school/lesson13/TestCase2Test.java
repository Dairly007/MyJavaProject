package school.lesson13;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestCase2Test
{
	static WebDriver driver;


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
	public void mainTest() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().getCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://andersenlab.com/");
		WebElement toScroll = driver.findElement(By.xpath("//a[normalize-space()='Pricing']"));
		assertNotNull(toScroll, "No such element");
		Actions action1 = new Actions(driver);
		action1.moveToElement(toScroll).click().release().build().perform();
		Thread.sleep(2000);
		WebElement lastEl = driver.findElement(By.xpath("//button[@class ='button-module--button--P1TTA button-module--" +
				"fullWidthMobile--NWml4 TitleWith-module--button--MLopd']"));
		assertNotNull(lastEl);
		Actions butt = new Actions(driver);
		butt.moveToElement(lastEl).click().build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement checkSendButton = driver.findElement(By.xpath("//button[@class ='button-module--button--" +
				"P1TTA button-module--sizeMD--QGOCN button-module--fullWidthMobile--NWml4']"));
		assertNotNull(checkSendButton);
	}

	@AfterClass
	public static void tearDown()
	{
		driver.quit();
	}


}