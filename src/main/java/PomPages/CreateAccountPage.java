package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	public CreateAccountPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id="First Name")
	private WebElement fName;
	
	@FindBy(id="Last Name")
	private WebElement lName;
	
	@FindBy(id="Male")
	private WebElement maleGender;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumber;
	
	@FindBy(id="Email Address")
	private WebElement emailAddress;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="Confirm Password")
	private WebElement confPassword;
	
	@FindBy(id="Terms and Conditions")
	private WebElement checkBox;
	
	@FindBy(xpath = "//button[@id='btnDisabled']")
	private WebElement registerButton;

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getMaleGender() {
		return maleGender;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfPassword() {
		return confPassword;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	
	
}
