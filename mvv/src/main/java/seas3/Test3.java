package seas3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	}
	
	
	@Test
	public void test() {
		
//		//by class
//		By userNameField =By.xpath("//div[@class='form-group m-bottom-md']/input");
//		By passWordField =By.xpath("//div[@class=\\'form-group\\']/input");
//		By signInField =By.xpath("//div[@class=\'m-top-md p-top-sm\']/button");
//		
		
		//by web element
		WebElement userNameElement= driver.findElement(By.xpath("//div[@class='form-group m-bottom-md']/input"));
		
		WebElement passWordElement= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		WebElement signInElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div[2]/div[1]/div[4]/button"));
		
		
		userNameElement.sendKeys("demo@techfios.com");
		passWordElement.sendKeys("abc123");
		signInElement.click();
		
		
		
		
		
		
		/*
		 * driver.findElement(By.xpath("//div[@class='form-group m-bottom-md']/input")).
		 * sendKeys("demo@techfios.com");
		 * driver.findElement(By.xpath("//div[@class=\'form-group\']/input")).sendKeys(
		 * "abc123");
		 * driver.findElement(By.xpath("//div[@class=\'m-top-md p-top-sm\']/button")).
		 * click();
		 */
	}
	
	@After
	public void treatDown() {
		driver.close();
		driver.quit();
	}
	
}
