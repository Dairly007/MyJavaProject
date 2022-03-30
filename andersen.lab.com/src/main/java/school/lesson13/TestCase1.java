package school.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestCase1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().getCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://andersenlab.com/");
		Actions scrollClk = new Actions(driver);
		Actions action1 = new Actions(driver);
		WebElement toScroll = driver.findElement(By.xpath("//section[@class='Footer-module--section--EJxys Footer-module--navigation--bWTHr']"
				+"//a[@class='NavColumn-module--link--Y6ySg'][normalize-space()='Financial Services']"));
		action1.moveToElement(toScroll);
		WebElement helpButton = driver.findElement(By.xpath("(//*[name()='svg'][@id='tooltipIcon'])[24]"));
		scrollClk.moveToElement(helpButton)
					.clickAndHold().release().build().perform();
		driver.quit();

//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript(Script, Arguments);
//		js.exucuteScript("arguments[0].click();", button);
	}
}