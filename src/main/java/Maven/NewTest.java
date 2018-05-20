package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest 
{
	public  WebDriver driver = null;
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivak\\Desktop\\vani\\FrameworkDemo\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
	}
@Test
public void login()
{
	driver.findElement(By.id("identifierId")).sendKeys("kalaivani1284@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
}
}
