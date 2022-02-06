package season4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;


public class Cls4 {
	
	
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
		

		WebElement userNameElement= driver.findElement(By.xpath("//div[@class='form-group m-bottom-md']/input"));
		
		WebElement passWordElement= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		WebElement signInElement= driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		
		userNameElement.sendKeys("demo@techfios.com");
		passWordElement.sendKeys("abc123");
		signInElement.click();
		WebElement dashElement= driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2"));
		WebElement custElement= driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]"));
		WebElement addElement= driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a"));
		
		
		
		Assert.assertEquals("page not found it","Dashboard", dashElement.getText());
		
		custElement.click();
		addElement.click();
		
		WebElement addContElement= driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2"));
		WebElement compatElement= driver.findElement(By.xpath("//*[@id=\"cid\"]"));
		Assert.assertEquals("Page not found it","Contacts", addContElement.getText());
	
		Select sel = new Select(compatElement);
		
		sel.selectByVisibleText("Techfios");
		
		
		
	}
	
//	@After
//	public void treatDown() {
//		driver.close();
//		driver.quit();
//	}
	
}