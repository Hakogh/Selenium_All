package season4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;


public class keyBoard {
	
	
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
		//signInElement.click();
		
		Actions action= new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
	}
	
}
