package school.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase2
{
	private static WebDriver driver;

	public TestCase2(WebDriver driver)
	{
		this.driver = driver;
	}

	public static WebDriver getDriver()
	{
		return driver;
	}

	public static void setDriver(WebDriver driver)
	{
		TestCase1.driver = driver;
	}

	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().getCookies();
		driver.get("https://andersenlab.com/");
		Actions action1 = new Actions(driver);
		WebElement toScroll = driver.findElement(By.xpath("//a[normalize-space()='Pricing']"));
		action1.moveToElement(toScroll).click().release().build().perform();
		Thread.sleep(2000);
		WebElement lastEl = driver.findElement(By.xpath("//button[@class='button-module--button--P1TTA" +
				" button-module--fullWidthMobile--NWml4 TitleWith-module--button--MLopd']"));
		action1.click(lastEl).release().build().perform();
		Thread.sleep(2000);
		driver.quit();
	}
}