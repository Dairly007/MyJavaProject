package school.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestCase1
{
	protected static WebDriver driver;

	public TestCase1(WebDriver driver)
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

	protected static By financialServices = By.xpath("//section[@class='Footer-module--section--EJxys Footer-module--navigation--bWTHr']"
			+"//a[@class='NavColumn-module--link--Y6ySg'][normalize-space()='Financial Services']");

	public static void main(String[] args)
	{
		WebElement tooltipIcon = driver.findElement(By.xpath("//div[@class='Hint-module--iconWrapper--GphH0 Hint-module--modalHint--xs9oi']/child::*"));
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().getCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://andersenlab.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", tooltipIcon);
		Actions action = new Actions(driver);

		action.moveToElement((WebElement) tooltipIcon)
				.clickAndHold().pause(1).release().build().perform();
		driver.quit();
	}
}