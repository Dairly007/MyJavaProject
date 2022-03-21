package school.lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex11
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://e.mail.ru/compose/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='ag-popup__frame__layout__iframe']")));
		WebElement login = driver.findElement(By.xpath("//input[@placeholder='Account name']"));
		login.sendKeys("dairlytest");
		login.submit();
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("Qw75912345");
		pass.submit();
		Thread.sleep(5000);
		WebElement setMail = driver.findElement(By.xpath("//div[@class='container--ItIg4 size_s--2eBQT size_s--3_M-_']//input[@type='text']"));
		setMail.click();
		setMail.sendKeys("dairlytest@mail.ru");
		driver.findElement(By.xpath("//span[@class='button2__txt']//ancestor::span[@tabindex='570'] ")).click();
		driver.findElement(By.xpath("//button[@class='base-0-2-91 primary-0-2-105 auto-0-2-117']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}

