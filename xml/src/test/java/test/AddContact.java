package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomer;
import page.Dashboard;
import page.LoginPage;
import util.BrowserFactory;

public class AddContact {

	WebDriver driver;

	//@Test
	@Parameters({ "username", "password","FullName", "CompanyName","Email","Phone","Adress","City","Country","Zip"})
	public void validCustomerShouldBeAbleToAddCustomer(String username, String password,String FullName,String CompanyName,String Email,String Phone,String Adress,String City,String Country,String Zip) {

		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.insertUserName(username);
		login.insertPassWord(password);
		login.clickSign();

		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);

		dashboard.verifyDashboard();
		dashboard.clickCustoer();
		dashboard.addCustomer();

		AddCustomer addCustomer = PageFactory.initElements(driver, AddCustomer.class);

		addCustomer.insertFullName(FullName);
		addCustomer.selectCompany(CompanyName);
		addCustomer.insertEmail(Email);
		addCustomer.insertPhone(Phone);
		addCustomer.insertAdress(Adress);
		addCustomer.insertCity(City);
		addCustomer.selectCountry(Country);
		addCustomer.insertZip(Zip);
		addCustomer.save();
		addCustomer.waitsum();

		dashboard.listCustomer();
		addCustomer.verifyEnterdNameAndDelete();
		
		BrowserFactory.treatDown();
	
	}
	
	@Test
	@Parameters({ "username", "password","FullName", "CompanyName","Email","Phone","Adress","City","Country","Zip"})
	public void validCustomerShouldBeAbleToAddCustomerFromList(String username, String password,String FullName,String CompanyName,String Email,String Phone,String Adress,String City,String Country,String Zip) {

		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.insertUserName(username);
		login.insertPassWord(password);
		login.clickSign();

		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);

		dashboard.verifyDashboard();
		dashboard.clickCustoer();
		dashboard.listCustomer();

		AddCustomer addCustomer = PageFactory.initElements(driver, AddCustomer.class);
		
		addCustomer.clickAddCustomerList();
		addCustomer.insertFullName(FullName);
		addCustomer.selectCompany(CompanyName);
		addCustomer.insertEmail(Email);
		addCustomer.insertPhone(Phone);
		addCustomer.insertAdress(Adress);
		addCustomer.insertCity(City);
		addCustomer.selectCountry(Country);
		addCustomer.insertZip(Zip);
		addCustomer.save();
		addCustomer.waitsum();

		dashboard.listCustomer();
	
		addCustomer.validSearchBoxAndProfileButton();
		/* BrowserFactory.treatDown(); */
	
	}


}
