package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopperLoginPage {

	public ShopperLoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy(xpath = "//strong")
	private WebElement shopperLoginText;
	
	@FindBy(xpath = "//span[text()='Create Account']")
	private WebElement createAccountButton;
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;
	
	
	public WebElement getShopperLoginText() {
		return shopperLoginText;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	
	
	
	
	
}
