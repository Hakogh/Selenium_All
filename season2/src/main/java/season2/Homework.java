package season2;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	
WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	
	}
	
	
	@Test
	public void testLocators() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name=\"login\" and @type=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"account\"]")).click();
	
		
		
		
		
		
		
		
	}
}
