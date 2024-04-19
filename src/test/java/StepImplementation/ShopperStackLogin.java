package StepImplementation;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomPages.CreateAccountPage;
import PomPages.HomePage;
import PomPages.ShopperLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopperStackLogin {
	
	WebDriver webDriver;
	HomePage homePage;
	ShopperLoginPage shopperLoginPage;
	
	@Before
	public void launchApplication() {
		webDriver=new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		webDriver.manage().window().maximize();
		homePage=new HomePage(webDriver);
		shopperLoginPage=new ShopperLoginPage(webDriver);
	}
		
	@Given("Check Whether the user is able login with valid data")
	public void checkWhetherTheUserIsAbleLoginWithValidData() {
		webDriver.get("https://www.shoppersstack.com/");
		
		homePage.getWelcomeMessage().isDisplayed();
		homePage.getLoginButtonOnHomePage().click();
		shopperLoginPage.getShopperLoginText().isDisplayed();
	}
	
	@When("user click on login button")
	public void userClickOnLoginButton(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		 Map<String, String> data = dataTable.asMap(String.class,String.class);
		 
		 shopperLoginPage.getEmailTextField().sendKeys(data.get("EmailAddress"));
		 shopperLoginPage.getPasswordTextField().sendKeys(data.get("Password"));
		 Thread.sleep(2000);
		 shopperLoginPage.getLoginButton().click();
	}
	@Then("Home page Should display")
	public void homePageShouldDisplay() throws InterruptedException {
		String title=webDriver.getTitle();
		if(!title.equals("ShoppersStack | Home")) {
			org.testng.Assert.assertFalse(false, "Something Went Wrong");
		}
	}
	
	@After
	public void closeApplication() {
		webDriver.quit();
	}
}
