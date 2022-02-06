package s5;

import java.util.Set;
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

public class Sea5 {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");
	}

	@Test
	public void windowH() {

		
		
		String handle1 = driver.getWindowHandle();
		//System.out.println(handle1);
		
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]"));
		search.sendKeys("xpath");

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

		String handle2 = driver.getWindowHandle();
		//System.out.println(handle2);

		WebElement wesc = driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[1]/h3/a"));
		wesc.click();

		// change driver from cureent window to the new window
		Set<String> handle = driver.getWindowHandles();
		//System.out.println(handle);

		//to print last window id wher driver is 
			for (String i : handle) {
				System.out.println(i);
				//switch driver
				driver.switchTo().window(i);
			}
			
			System.out.println(driver.getTitle());
	}
}
