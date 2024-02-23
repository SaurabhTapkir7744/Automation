package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement usernameTextfield;

	@FindBy(name = "pwd")
	private WebElement passwordTextField;

	@FindBy(name = "loginButton")
	private WebElement loginButton;

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void loginIntoActitime(String username, String password) {
		usernameTextfield.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();

	}

}
