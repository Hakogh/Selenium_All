package season2;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	
	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://objectspy.space/");
	
	}
	
	
	@Test
	public void testLocators() throws InterruptedException {
		
		//by name
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		//by id
		driver.findElement(By.id("sex-1")).click();
		//by class and upload file we use robot class if element is not input 
		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\nasser\\eclipse-workspace\\ClassOne\\src\\test\\T3.java");
		//by link
		//driver.findElement(By.linkText("https://objectspy.com/os_api_prod/")).click();
		//by pertiallink
		//driver.findElement(By.partialLinkText("Backend")).click();
		
		//by ccs
		driver.findElement(By.cssSelector("input#exp-2")).click();
		//driver.findElement(By.cssSelector("input[value=\"Automation Tester\"]")).click();
		driver.findElement(By.cssSelector("input[type=\"checkbox\"][value=\"Automation Tester\"]")).click();
		
		//by xpath
		//absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("9ro9ro");
		Thread.sleep(3000);
		
		//realtive
		driver.findElement(By.xpath("//input[@name=\'lastname\']")).clear();
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("9ro9ro=2");
		driver.findElement(By.xpath("//input[@name=\"exp\" and @value=\"6\"]")).click();
		
		// link
		//driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		
		driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();
		
	}
	
	
	
	
	
	
	
	
//	@After
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}
//	
	
	
	
}
