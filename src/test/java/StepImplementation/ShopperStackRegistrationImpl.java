package StepImplementation;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomPages.CreateAccountPage;
import PomPages.HomePage;
import PomPages.ShopperLoginPage;
import dev.failsafe.internal.util.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopperStackRegistrationImpl {

	WebDriver webDriver;
	HomePage homePage;
	ShopperLoginPage shopperLoginPage;
	CreateAccountPage createAccountPage;
	
	@Before
	public void launchApplication() {
		webDriver=new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		webDriver.manage().window().maximize();
		homePage=new HomePage(webDriver);
		shopperLoginPage=new ShopperLoginPage(webDriver);
		createAccountPage=new CreateAccountPage(webDriver);
	}
	
	@Given("I want check wether the user is able to resiter or not")
	public void iWantCheckWetherTheUserIsAbleToResiterOrNot() throws InterruptedException {
		webDriver.get("https://www.shoppersstack.com/");
		
		
		homePage.getWelcomeMessage().isDisplayed();
		homePage.getLoginButtonOnHomePage().click();
		shopperLoginPage.getShopperLoginText().isDisplayed();
		shopperLoginPage.getCreateAccountButton().click();
	}
	
	@When("user click on Register button and enter the data")
	public void userClickOnRegisterButtonAndEnterTheData(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		 Map<String, String> data = dataTable.asMap(String.class,String.class);
		 
		  createAccountPage.getfName().sendKeys(data.get("Fname"));
		  createAccountPage.getlName().sendKeys(data.get("Lname"));
		  createAccountPage.getMaleGender().click();
		  createAccountPage.getPhoneNumber().sendKeys(data.get("PhoneNumber"));
		  createAccountPage.getEmailAddress().sendKeys(data.get("EmailAddress"));
		  createAccountPage.getPassword().sendKeys(data.get("Password"));
		  createAccountPage.getConfPassword().sendKeys(data.get("Password"));
		  createAccountPage.getCheckBox().click();
		  Thread.sleep(2000);
		  createAccountPage.getRegisterButton().click();
	}
	
	@Then("Success Toaster Message should be displayed")
	public void successToasterMessageShouldBeDisplayed() {
		 String message=homePage.getSuccessToasterMessage().getText();
		  if(!message.equals("Successfully Registered")) {
			org.testng.Assert.assertFalse(false, "Something Went Wrong");
		  }
	}

	@After
	public void closeApplication() {
		webDriver.quit();
	}

	
}
