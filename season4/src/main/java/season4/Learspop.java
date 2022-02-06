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

public class Learspop {

	WebDriver driver;
	
	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
	}
	
//	@Test
//	public void testpop() {
//		
//		WebElement SIGN=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]"));
//		SIGN.click();
//		String Alert= driver.switchTo().alert().getText();
//		System.out.println(Alert);
//		driver.switchTo().alert().accept();
//	}
	
	
	@Test
	public void testIframe() {
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Adjustable")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("HORIZONTAL")).click();
		
	}
	
	
	
	
	
}




