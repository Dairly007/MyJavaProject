package school.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestCase2
{
	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().getCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://andersenlab.com/");
		Actions scrollClk = new Actions(driver);
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