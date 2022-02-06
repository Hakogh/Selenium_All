package demotest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ju {

	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("mo9ram");
	}

	@Before
	public void Lanchbrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		
	
	
	
	}
	
	

	@Test
	public void Test1() throws InterruptedException {
		// identify element
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);

		// driver in other method create a global variable.

	}

	@Test
	public void Test2() throws InterruptedException {
		// identify element
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1fvgb23");
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);

		// driver in other method create a global variable.

	}

	@After
	public void treadDown() {
		driver.close();
	}

}
