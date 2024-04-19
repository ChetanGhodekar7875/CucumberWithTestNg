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

	public WebElement getShopperLoginText() {
		return shopperLoginText;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}
	
	
}
