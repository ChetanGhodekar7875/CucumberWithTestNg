package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {

	public HomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//h3")
	private WebElement welcomeMessage;
	
	@FindBy(id = "loginBtn")
	private WebElement loginButtonOnHomePage;
	
	@FindBy(xpath = "//div[text()='Successfully Registered']")
	private WebElement successToasterMessage;
	
	@FindBy(xpath = "//a[text()='Home']")
	private WebElement homeLink;


	public WebElement getWelcomeMessage() {
		return welcomeMessage;
	}

	public WebElement getLoginButtonOnHomePage() {
		return loginButtonOnHomePage;
	}

	public WebElement getSuccessToasterMessage() {
		return successToasterMessage;
	}
	
	public WebElement getHomeLink() {
		return homeLink;
	}
	
}
