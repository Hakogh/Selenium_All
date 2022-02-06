package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomer extends BasePage {

	WebDriver driver;

	public AddCustomer(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SUBMIT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"summary\"]")
	WebElement SUMMARY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[1]")
	WebElement ADD_CUSTOMER_LIST_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"foo_filter\"]")
	WebElement SEARCH_LIST_ELEMENT;

	String generateName;

	public void insertFullName(String username) {

		generateName = username + generateRandomNo(999);
		FULL_NAME_ELEMENT.sendKeys(generateName);
	}

	public void selectCompany(String company) {

		selectFromDropDown(COMPANY_ELEMENT, company);
	}

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(9999) + email);
	}

	public void insertPhone(String phone) {

		PHONE_ELEMENT.sendKeys(phone + generateRandomNo(99));
	}

	public void insertAdress(String ADR) {
		ADRESS_ELEMENT.sendKeys(ADR);
	}

	public void insertCity(String CITY) {
		CITY_ELEMENT.sendKeys(CITY);
	}

	public void selectCountry(String country) {
		selectFromDropDown(COUNTRY_ELEMENT, country);
	}

	public void insertZip(String ZIPCODE) {
		ZIP_ELEMENT.sendKeys(ZIPCODE);
	}

	public void save() {
		SUBMIT_ELEMENT.click();
	}

	public void waitsum() {
		waitForElement(driver, 5, SUMMARY_ELEMENT);
		Assert.assertEquals(SUMMARY_ELEMENT.getText(), "Summary", "wrong page");
	}

	// tbody/tr[1]/td[3]

	// tbody/tr[1]/td[3]/following-sibling::td[4]/a[2]
	// tbody/tr[1]/td[7]/a[2]

	String beforXpath = "//tbody/tr[";
	String afterXpath = "]/td[3]";
	String afterXpathDelete = "]/td[7]/a[2]";
	String afterXpathProfile ="]/td[7]/a[1]";

	public void verifyEnterdNameAndDelete() {

		for (int i = 1; i <= 10; i++) {

			String enteredName = driver.findElement(By.xpath(beforXpath + i + afterXpath)).getText();

			System.out.println(enteredName);
			Assert.assertEquals(enteredName, generateName, "invalide name");

			if (enteredName.contains(generateName)) {
				System.out.println("exist");
				driver.findElement(By.xpath(beforXpath + i + afterXpathDelete)).click();

			}

			break;

		}
		WebElement textbox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]"));
		textbox.sendKeys(Keys.ENTER);

	
	}

	public void clickAddCustomerList() {
	
			ADD_CUSTOMER_LIST_ELEMENT.click();		
		}
	public void validSearchBoxAndProfileButton() {
		SEARCH_LIST_ELEMENT.sendKeys(generateName);
		for(int i =1; i<= 9; i++) {
		String name =	driver.findElement(By.xpath(beforXpath + i+ afterXpath)).getText();
		if(name.contains(generateName)) {
			System.out.println("entred name exist///");
			driver.findElement(By.xpath(beforXpath + i +afterXpathProfile)).click();
			
			
		}
		
		}
	}


}




	

