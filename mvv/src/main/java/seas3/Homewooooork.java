package seas3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homewooooork {

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
	public void test1() {
		
//		//by class
//		By userNameField =By.xpath("//div[@class='form-group m-bottom-md']/input");
//		By passWordField =By.xpath("//div[@class=\\'form-group\\']/input");
//		By signInField =By.xpath("//div[@class=\'m-top-md p-top-sm\']/button");
//		
		
		//by web element
		WebElement userNameElement= driver.findElement(By.xpath("//div[@class='form-group m-bottom-md']/input"));
		
		WebElement passWordElement= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		WebElement signInElement= driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
	
		userNameElement.sendKeys("demo@techfios.com");
		passWordElement.sendKeys("abc123");
		signInElement.click();
	

		
		WebElement bankElement= driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]"));
		WebElement newaccElement= driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a"));
		
		bankElement.click();
		newaccElement.click();
		
		WebElement acntElement= driver.findElement(By.xpath("//*[@id=\"account\"]"));
		WebElement descElement= driver.findElement(By.xpath("//*[@id=\"description\"]"));
		WebElement intbElement= driver.findElement(By.xpath("//*[@id=\"balance\"]"));
		WebElement acntnElement= driver.findElement(By.xpath("//*[@id=\"account_number\"]"));
		WebElement persnconElement= driver.findElement(By.xpath("//*[@id=\"contact_person\"]"));
		WebElement phoneElement= driver.findElement(By.xpath("//*[@id=\"contact_phone\"]"));
		WebElement subElement= driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button"));
		
		
		
		acntElement.sendKeys("chacking");
		descElement.sendKeys("my new personal checking");
		intbElement.sendKeys("2000.00");
		acntnElement.sendKeys("2029456378");
		persnconElement.sendKeys("9ro9ro khass");
		phoneElement.sendKeys("550105089");
		subElement.click();
		
	}
		
		
		
		
		/*
		 * driver.findElement(By.xpath("//div[@class='form-group m-bottom-md']/input")).
		 * sendKeys("demo@techfios.com");
		 * driver.findElement(By.xpath("//div[@class=\'form-group\']/input")).sendKeys(
		 * "abc123");
		 * driver.findElement(By.xpath("//div[@class=\'m-top-md p-top-sm\']/button")).
		 * click();
		 */
	
	
	@After
	public void treatDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
	
}
