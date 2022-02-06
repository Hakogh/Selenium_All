package season4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;


public class Learnmouse {
	
	
	WebDriver driver;
	
	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
	}
	
	@Test
	public void mouse() {
		
		WebElement producrElement=driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/a/span"));
		
		WebElement monitElement=driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[11]/a"));
		
		WebElement homeElement=driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[11]/ul/li[3]/a"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(producrElement).build().perform();
		action.moveToElement(monitElement).build().perform();
		action.moveToElement(homeElement).build().perform();
		homeElement.click();
		
	}
	
	
	
	
}



